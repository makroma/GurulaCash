package models

import models._

case class Money(var balance: Int){ 


	def deposit(amount: Int) = balance += amount
	def withdraw(amount: Int) = balance -= amount
}