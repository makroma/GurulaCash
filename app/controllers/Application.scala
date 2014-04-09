package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import play.api.mvc.Flash
import models._
import views._


object Application extends Controller {

 
  def index = Action {
    Redirect(routes.Auth.authenticate)
  }
  

}