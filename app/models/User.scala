package models

case class User(var id: Long, var name: String, var balance: Money, var password: String)
//Model class:

object User { //Data Access object - Companion

	var users = Set (
		User(1, "Marko", new  Money(0), "1234"),
		User(2, "Jouhou", new Money(10), "1234"),
		User(3, "Elias", new Money(500), "1234"),
		User(4, "Jenny", new Money(300), "1234")
		)

	//Finder functions

	def findAll = users.toList.sortBy(_.balance.balance).reverse

	def findByName(name: String) = users.find(_.name == name)

	def getUser(name: String): User ={
		for(u<-users) { 
		  if (u.name == name) return u
		}
		null
	}

	def findById(id: Long):User = {
		for(u<-users) { 
		  if (u.id == id) return u
		}
		null
	}

	def checkUserPassword(name: String, password: String):Boolean = {
		for(u<-users) { 
		  if (u.name == name && u.password == password) 
		    return true 
		}
		false
	}
}