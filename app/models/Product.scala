package models

case class Product(ean: Long, name: String, description: String, saldo: Long) 
//Model Class: ean-code, name etc.

object Product { //Data Access object
  //Kumppaniobjekti

  var products = Set(
    Product(5010255079763L, "Coffee", "Enjoy Jamaican dark roasted organic.", 10),
    Product(5018206244666L, "Tea", "Black, green or white. The chose of elegancy.", 3),
    Product(5018306332812L, "Noodles", "Japanese quality Soba. Served chilled with dipping sauce.", 500),
    Product(5018306312913L, "Chocolade", "Organic fairtrade 88% cocoa.", 30),
    Product(5018206244611L, "PowerKing", "Definite chose for the action.", 5)
  )

  //Finder functions

  def findAll = products.toList.sortBy(_.ean) //toList.sortBy ean code

  def findByEan(ean: Long) = products.find(_.ean == ean) //uses find method to and compares.

  def add (product: Product) { products += product }
}