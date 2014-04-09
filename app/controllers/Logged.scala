package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

import models.User
import models.Product
import models.Money
import views._
import scala.util.Random

object Logged extends Controller {

  private val moneyForm: Form[Money] = Form(
    mapping(
      //FormFields 
    	"Deposit" -> number
      )(Money.apply)(Money.unapply) //map between form and model
      )

  def add = Action { implicit request =>
    Ok(views.html.Users.addmoney(moneyForm))
  }

  def deposit = Action { implicit request =>
    val newMoneyForm = moneyForm.bindFromRequest()

    newMoneyForm.fold(

      //if fails, redirect back to Add
      hasErrors = { form =>
        Redirect(routes.Logged.welcome()).flashing(Flash(form.data) //Flash scope with message
        )
      },

      // is success, save and redirect
      success = { deposit =>
        
        println("deposit success!" + deposit)
        
        request.session.get("username").map { user =>
          User.getUser(user).balance.deposit(deposit.balance)
        }.getOrElse {
          Unauthorized("Oops, you are not logged in.")
        }

        Redirect(routes.Logged.welcome()).flashing(
          "success" -> "Your made a deposit." //Flash scope with message
          )
      })
  }
  def depositAction = Action { implicit request =>
    request.session.get("username").map { user =>
      Ok(html.shop("Deposit")(views.html.Users.loggedUser(User.getUser(user))(moneyForm), views.html.products.shoplist(Product.findAll)))
    }.getOrElse {
      Unauthorized("Oops, you are not logged in.")
    }
  }

  def home = Action { implicit request =>
    request.session.get("username").map { user =>
      Ok(views.html.Users.userHome(User.getUser(user)))
    }.getOrElse {
      Unauthorized("Oops, you are not logged in.")
    }
  }

  def welcome = Action { implicit request =>

    request.session.get("username").map { user =>
      Ok(html.shop("welcome")(views.html.Users.userHome(User.getUser(user)), views.html.products.shoplist(Product.findAll)))
      //views.html.Users.loggedUser(User.getUser(user))(), views.html.products.shoplist(Product.findAll)))
    }.getOrElse {
      Unauthorized("Oops, you are not logged in.")
    }
  }

  def market = Action { implicit request =>
    request.session.get("username").map { user =>
      Ok(html.shop("Marketroom")(views.html.products.saleBox(Product.findAll), views.html.products.shoplist(Product.findAll)))
    }.getOrElse {
      Unauthorized("Oops, you are not logged in.")
    }
  }
    def buy(product: String) = Action { implicit request =>
    request.session.get("username").map { user =>
     
      println("buy all you fool!" + product)
      
      Ok(html.shop("Marketroom")(views.html.products.saleBox(Product.findAll), views.html.products.shoplist(Product.findAll)))
    }.getOrElse {
      Unauthorized("Oops, you are not logged in.")
    }
  }

  def ranColor = {
    val colours = List(
      ("#468966"),
      ("#85762B"),
      ("#7A2B00"),
      ("#B64926"),
      ("#7D8A2E"),
      ("#1F8A70"),
      ("#FFE11A"))
    colours(Random.nextInt(6))
  }
}