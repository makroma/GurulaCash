package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

import models.User
import views._

object Auth extends Controller {

  val loginForm = Form(
    tuple(
      "username" -> text,
      "password" -> text) verifying ("Invalid username or password", result => result match {
        case (username, password) => check(username, password)
      }))

  def check(username: String, password: String): Boolean = {
    models.User.checkUserPassword(username, password)
  }

  def index = Action { implicit request =>
    var users = User.findAll

    Ok(html.login(loginForm, views.html.Users.usersWide(users)))
  }

  def authenticate = Action { implicit request =>
    loginForm.bindFromRequest.fold(
      formWithErrors => BadRequest(html.login(formWithErrors, views.html.Users.usersWide(User.findAll))).withNewSession.flashing(
        "error" -> "Wrong password or username."),
      user => Redirect(routes.Logged.welcome).withSession(Security.username -> user._1).flashing(
        "success" -> "You are now logged In."))
  }
  def logout = Action {
    Redirect(routes.Auth.authenticate).withNewSession.flashing(
      "success" -> "You are now logged out. Thank you for your support!")
  }
}