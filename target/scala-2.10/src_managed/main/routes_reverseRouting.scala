// @SOURCE:/Users/marko/Dev/products/conf/routes
// @HASH:19c45792564dd336833b35eba10406df17e6e504
// @DATE:Wed Apr 09 22:40:35 EEST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:39
// @LINE:36
// @LINE:33
// @LINE:32
// @LINE:29
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:9
// @LINE:6
package controllers {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:29
class ReverseUsers {
    

// @LINE:29
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users")
}
                                                
    
}
                          

// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
class ReverseLogged {
    

// @LINE:21
def depositAction(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "deposit")
}
                                                

// @LINE:17
def welcome(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "shop")
}
                                                

// @LINE:18
def add(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "add")
}
                                                

// @LINE:19
def deposit(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "add")
}
                                                

// @LINE:22
def market(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "market")
}
                                                

// @LINE:20
def home(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "home")
}
                                                

// @LINE:23
def buy(pro:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "buy/" + implicitly[PathBindable[String]].unbind("pro", dynamicString(pro)))
}
                                                
    
}
                          

// @LINE:14
// @LINE:13
class ReverseAuth {
    

// @LINE:14
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:13
def authenticate(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:39
class ReverseBarcodes {
    

// @LINE:39
def barcode(ean:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "barcode/" + implicitly[PathBindable[Long]].unbind("ean", ean))
}
                                                
    
}
                          

// @LINE:36
// @LINE:33
// @LINE:32
// @LINE:26
class ReverseProducts {
    

// @LINE:33
def newProduct(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "products/new")
}
                                                

// @LINE:32
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "products")
}
                                                

// @LINE:26
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "products")
}
                                                

// @LINE:36
def show(ean:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "products/" + implicitly[PathBindable[Long]].unbind("ean", ean))
}
                                                
    
}
                          
}
                  


// @LINE:39
// @LINE:36
// @LINE:33
// @LINE:32
// @LINE:29
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:29
class ReverseUsers {
    

// @LINE:29
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
      }
   """
)
                        
    
}
              

// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
class ReverseLogged {
    

// @LINE:21
def depositAction : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Logged.depositAction",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deposit"})
      }
   """
)
                        

// @LINE:17
def welcome : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Logged.welcome",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shop"})
      }
   """
)
                        

// @LINE:18
def add : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Logged.add",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add"})
      }
   """
)
                        

// @LINE:19
def deposit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Logged.deposit",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "add"})
      }
   """
)
                        

// @LINE:22
def market : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Logged.market",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "market"})
      }
   """
)
                        

// @LINE:20
def home : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Logged.home",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home"})
      }
   """
)
                        

// @LINE:23
def buy : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Logged.buy",
   """
      function(pro) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "buy/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("pro", encodeURIComponent(pro))})
      }
   """
)
                        
    
}
              

// @LINE:14
// @LINE:13
class ReverseAuth {
    

// @LINE:14
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Auth.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:13
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Auth.authenticate",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:39
class ReverseBarcodes {
    

// @LINE:39
def barcode : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Barcodes.barcode",
   """
      function(ean) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "barcode/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("ean", ean)})
      }
   """
)
                        
    
}
              

// @LINE:36
// @LINE:33
// @LINE:32
// @LINE:26
class ReverseProducts {
    

// @LINE:33
def newProduct : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Products.newProduct",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products/new"})
      }
   """
)
                        

// @LINE:32
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Products.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "products"})
      }
   """
)
                        

// @LINE:26
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Products.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products"})
      }
   """
)
                        

// @LINE:36
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Products.show",
   """
      function(ean) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("ean", ean)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:39
// @LINE:36
// @LINE:33
// @LINE:32
// @LINE:29
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:29
class ReverseUsers {
    

// @LINE:29
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.list(), HandlerDef(this, "controllers.Users", "list", Seq(), "GET", """ Users list page""", _prefix + """users""")
)
                      
    
}
                          

// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
class ReverseLogged {
    

// @LINE:21
def depositAction(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Logged.depositAction(), HandlerDef(this, "controllers.Logged", "depositAction", Seq(), "GET", """""", _prefix + """deposit""")
)
                      

// @LINE:17
def welcome(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Logged.welcome(), HandlerDef(this, "controllers.Logged", "welcome", Seq(), "GET", """ Logged in page""", _prefix + """shop""")
)
                      

// @LINE:18
def add(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Logged.add(), HandlerDef(this, "controllers.Logged", "add", Seq(), "GET", """""", _prefix + """add""")
)
                      

// @LINE:19
def deposit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Logged.deposit(), HandlerDef(this, "controllers.Logged", "deposit", Seq(), "POST", """""", _prefix + """add""")
)
                      

// @LINE:22
def market(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Logged.market(), HandlerDef(this, "controllers.Logged", "market", Seq(), "GET", """""", _prefix + """market""")
)
                      

// @LINE:20
def home(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Logged.home(), HandlerDef(this, "controllers.Logged", "home", Seq(), "GET", """""", _prefix + """home""")
)
                      

// @LINE:23
def buy(pro:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Logged.buy(pro), HandlerDef(this, "controllers.Logged", "buy", Seq(classOf[String]), "GET", """""", _prefix + """buy/$pro<[^/]+>""")
)
                      
    
}
                          

// @LINE:14
// @LINE:13
class ReverseAuth {
    

// @LINE:14
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Auth.logout(), HandlerDef(this, "controllers.Auth", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:13
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Auth.authenticate(), HandlerDef(this, "controllers.Auth", "authenticate", Seq(), "GET", """ Authentication""", _prefix + """login""")
)
                      
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          

// @LINE:39
class ReverseBarcodes {
    

// @LINE:39
def barcode(ean:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Barcodes.barcode(ean), HandlerDef(this, "controllers.Barcodes", "barcode", Seq(classOf[Long]), "GET", """ route to generate barcode""", _prefix + """barcode/$ean<[^/]+>""")
)
                      
    
}
                          

// @LINE:36
// @LINE:33
// @LINE:32
// @LINE:26
class ReverseProducts {
    

// @LINE:33
def newProduct(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Products.newProduct(), HandlerDef(this, "controllers.Products", "newProduct", Seq(), "GET", """""", _prefix + """products/new""")
)
                      

// @LINE:32
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Products.save(), HandlerDef(this, "controllers.Products", "save", Seq(), "POST", """ new products""", _prefix + """products""")
)
                      

// @LINE:26
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Products.list(), HandlerDef(this, "controllers.Products", "list", Seq(), "GET", """ Product list page""", _prefix + """products""")
)
                      

// @LINE:36
def show(ean:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Products.show(ean), HandlerDef(this, "controllers.Products", "show", Seq(classOf[Long]), "GET", """ Route with ean parameter""", _prefix + """products/$ean<[^/]+>""")
)
                      
    
}
                          
}
        
    