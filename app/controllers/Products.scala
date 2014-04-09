package controllers

import play.api.mvc.{Action, Controller}
import models.Product

import play.api._
import play.api.mvc._
import play.api.data._

import play.api.data.Form
import play.api.data.Form._
import play.api.data.Forms.{mapping, longNumber, nonEmptyText}
import play.api.i18n.Messages
import play.api.mvc.Flash
import play.api.data.format.Formats._ 
import play.api.data.validation.Constraints._

/*
* Controller coordinates with hmtl render "products/list.scala.html" and model "Products.scala".
* This controller is responsible for handling incoming HTTP requests and 
* generating responses, using the model and views(html render). 
*/

object Products extends Controller {

  def list = Action { implicit request => //Controller action

    val products = Product.findAll //get the product list from model

    Ok(views.html.products.list(products)) //render view - sends list as a parameter.
  }

	def show(ean: Long) = Action { implicit request =>
		Product.findByEan(ean).map { product => //Renders product detail page
		  //findByEan returns product - .map will transform it to page

		Ok(views.html.products.details(product))
		}.getOrElse(NotFound) // or 404 error
	}

	private val productForm: Form[Product] = Form(
  		mapping(
  			//FormFields 
		    "ean" -> longNumber.verifying("validation.ean.duplicate", Product.findByEan(_).isEmpty),
		    "name" -> nonEmptyText,
		    "description" -> nonEmptyText,
		    "saldo" -> longNumber
  		)(Product.apply)(Product.unapply) //map between form and model
	)

	def save = Action { implicit request =>
		//Fills for with users input
		val newProductForm = productForm.bindFromRequest()

		newProductForm.fold(

			//if fails, redirect back to Add
			hasErrors = { form =>
				Redirect(routes.Products.newProduct()).flashing(Flash(form.data) + //Flash scope with message
						("error" -> Messages("validation.errors")))
			},

			// is success, save and redirect
			success = { newProduct =>
				Product.add(newProduct)
				Redirect(routes.Products.show(newProduct.ean)).flashing()
					//Flash scope with message
			} 
		)
	}	
	def newProduct = Action { implicit request =>
		val form = if (flash.get("error").isDefined) 
		//If there’s a validation error, bind flash scope data to form.

			productForm.bind(flash.data)
		else
			productForm
		Ok(views.html.products.editProduct(form)) //Render new page
	}
}