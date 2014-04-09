package controllers

import play.api.mvc.{Action, Controller}
import models.User


object Users extends Controller {
	
	def list = Action { implicit request =>
		var users = User.findAll

		Ok(views.html.Users.list(users))

	}
}