// @SOURCE:/Users/marko/Dev/products/conf/routes
// @HASH:19c45792564dd336833b35eba10406df17e6e504
// @DATE:Wed Apr 09 22:40:35 EEST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:13
private[this] lazy val controllers_Auth_authenticate2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:14
private[this] lazy val controllers_Auth_logout3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:17
private[this] lazy val controllers_Logged_welcome4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shop"))))
        

// @LINE:18
private[this] lazy val controllers_Logged_add5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("add"))))
        

// @LINE:19
private[this] lazy val controllers_Logged_deposit6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("add"))))
        

// @LINE:20
private[this] lazy val controllers_Logged_home7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home"))))
        

// @LINE:21
private[this] lazy val controllers_Logged_depositAction8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deposit"))))
        

// @LINE:22
private[this] lazy val controllers_Logged_market9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("market"))))
        

// @LINE:23
private[this] lazy val controllers_Logged_buy10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("buy/"),DynamicPart("pro", """[^/]+""",true))))
        

// @LINE:26
private[this] lazy val controllers_Products_list11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("products"))))
        

// @LINE:29
private[this] lazy val controllers_Users_list12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users"))))
        

// @LINE:32
private[this] lazy val controllers_Products_save13 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("products"))))
        

// @LINE:33
private[this] lazy val controllers_Products_newProduct14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("products/new"))))
        

// @LINE:36
private[this] lazy val controllers_Products_show15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("products/"),DynamicPart("ean", """[^/]+""",true))))
        

// @LINE:39
private[this] lazy val controllers_Barcodes_barcode16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("barcode/"),DynamicPart("ean", """[^/]+""",true))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Auth.authenticate"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Auth.logout"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shop""","""controllers.Logged.welcome"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """add""","""controllers.Logged.add"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """add""","""controllers.Logged.deposit"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home""","""controllers.Logged.home"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deposit""","""controllers.Logged.depositAction"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """market""","""controllers.Logged.market"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """buy/$pro<[^/]+>""","""controllers.Logged.buy(pro:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products""","""controllers.Products.list"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users""","""controllers.Users.list"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products""","""controllers.Products.save"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products/new""","""controllers.Products.newProduct"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products/$ean<[^/]+>""","""controllers.Products.show(ean:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """barcode/$ean<[^/]+>""","""controllers.Barcodes.barcode(ean:Long)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:13
case controllers_Auth_authenticate2(params) => {
   call { 
        invokeHandler(controllers.Auth.authenticate, HandlerDef(this, "controllers.Auth", "authenticate", Nil,"GET", """ Authentication""", Routes.prefix + """login"""))
   }
}
        

// @LINE:14
case controllers_Auth_logout3(params) => {
   call { 
        invokeHandler(controllers.Auth.logout, HandlerDef(this, "controllers.Auth", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:17
case controllers_Logged_welcome4(params) => {
   call { 
        invokeHandler(controllers.Logged.welcome, HandlerDef(this, "controllers.Logged", "welcome", Nil,"GET", """ Logged in page""", Routes.prefix + """shop"""))
   }
}
        

// @LINE:18
case controllers_Logged_add5(params) => {
   call { 
        invokeHandler(controllers.Logged.add, HandlerDef(this, "controllers.Logged", "add", Nil,"GET", """""", Routes.prefix + """add"""))
   }
}
        

// @LINE:19
case controllers_Logged_deposit6(params) => {
   call { 
        invokeHandler(controllers.Logged.deposit, HandlerDef(this, "controllers.Logged", "deposit", Nil,"POST", """""", Routes.prefix + """add"""))
   }
}
        

// @LINE:20
case controllers_Logged_home7(params) => {
   call { 
        invokeHandler(controllers.Logged.home, HandlerDef(this, "controllers.Logged", "home", Nil,"GET", """""", Routes.prefix + """home"""))
   }
}
        

// @LINE:21
case controllers_Logged_depositAction8(params) => {
   call { 
        invokeHandler(controllers.Logged.depositAction, HandlerDef(this, "controllers.Logged", "depositAction", Nil,"GET", """""", Routes.prefix + """deposit"""))
   }
}
        

// @LINE:22
case controllers_Logged_market9(params) => {
   call { 
        invokeHandler(controllers.Logged.market, HandlerDef(this, "controllers.Logged", "market", Nil,"GET", """""", Routes.prefix + """market"""))
   }
}
        

// @LINE:23
case controllers_Logged_buy10(params) => {
   call(params.fromPath[String]("pro", None)) { (pro) =>
        invokeHandler(controllers.Logged.buy(pro), HandlerDef(this, "controllers.Logged", "buy", Seq(classOf[String]),"GET", """""", Routes.prefix + """buy/$pro<[^/]+>"""))
   }
}
        

// @LINE:26
case controllers_Products_list11(params) => {
   call { 
        invokeHandler(controllers.Products.list, HandlerDef(this, "controllers.Products", "list", Nil,"GET", """ Product list page""", Routes.prefix + """products"""))
   }
}
        

// @LINE:29
case controllers_Users_list12(params) => {
   call { 
        invokeHandler(controllers.Users.list, HandlerDef(this, "controllers.Users", "list", Nil,"GET", """ Users list page""", Routes.prefix + """users"""))
   }
}
        

// @LINE:32
case controllers_Products_save13(params) => {
   call { 
        invokeHandler(controllers.Products.save, HandlerDef(this, "controllers.Products", "save", Nil,"POST", """ new products""", Routes.prefix + """products"""))
   }
}
        

// @LINE:33
case controllers_Products_newProduct14(params) => {
   call { 
        invokeHandler(controllers.Products.newProduct, HandlerDef(this, "controllers.Products", "newProduct", Nil,"GET", """""", Routes.prefix + """products/new"""))
   }
}
        

// @LINE:36
case controllers_Products_show15(params) => {
   call(params.fromPath[Long]("ean", None)) { (ean) =>
        invokeHandler(controllers.Products.show(ean), HandlerDef(this, "controllers.Products", "show", Seq(classOf[Long]),"GET", """ Route with ean parameter""", Routes.prefix + """products/$ean<[^/]+>"""))
   }
}
        

// @LINE:39
case controllers_Barcodes_barcode16(params) => {
   call(params.fromPath[Long]("ean", None)) { (ean) =>
        invokeHandler(controllers.Barcodes.barcode(ean), HandlerDef(this, "controllers.Barcodes", "barcode", Seq(classOf[Long]),"GET", """ route to generate barcode""", Routes.prefix + """barcode/$ean<[^/]+>"""))
   }
}
        
}

}
     