
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,Html,Flash,Lang,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html)(implicit flash: Flash, lang: Lang):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.67*/("""
<!--Parameter list, flash scope, some localization-->

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*8.17*/title)),format.raw/*8.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/main.css"))),format.raw/*9.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.54*/routes/*10.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*10.99*/("""">
    </head>
    <body>
   		
		<div class="navbar navbar-inverse navbar-fixed-top" role="navigation"> <!--Bootstrap navbar-->
			<div class="container">
				<div class="navbar-header">
					<a class="navbar-brand" href="">Gurulan Kassa - admin</a>
				</div>

				<div class="navbar-collapse collapse">
					
					<ul class="nav navbar-nav">
						<li>
	  						<a href=""""),_display_(Seq[Any](/*24.20*/routes/*24.26*/.Users.list())),format.raw/*24.39*/("""">	
	  							"""),_display_(Seq[Any](/*25.12*/Messages("application.users"))),format.raw/*25.41*/("""
							</a>
						</li>
					
						<li>
							<a href=""""),_display_(Seq[Any](/*30.18*/routes/*30.24*/.Products.list())),format.raw/*30.40*/("""">
							"""),_display_(Seq[Any](/*31.9*/Messages("products.list.navigation"))),format.raw/*31.45*/("""
							</a> 
						</li>
					
						<!--<li>
							<a href=""""),_display_(Seq[Any](/*36.18*/routes/*36.24*/.Products.newProduct())),format.raw/*36.46*/("""">
							<i class="icon-plus icon-black"></i>
							"""),_display_(Seq[Any](/*38.9*/Messages("products.new.command"))),format.raw/*38.41*/("""
							</a>
						</li>-->
						
					</ul>
					<form class="navbar-form navbar-right" role="form">

						<a class="btn btn-primary" role="button"href=""""),_display_(Seq[Any](/*45.54*/routes/*45.60*/.Auth.logout)),format.raw/*45.72*/("""" class="logout">logout</a>
						
					</form> 
				</div>	
			</div>
		</div>
		
		
		
		<div class="container theme-showcase" role="main">
	 		<div class="jumbotron"><!--Output page content block-->

		 		<!--show success message-->

		 		"""),_display_(Seq[Any](/*59.7*/if(flash.get("success").isDefined)/*59.41*/{_display_(Seq[Any](format.raw/*59.42*/("""
					<div class="alert alert-success">
						"""),_display_(Seq[Any](/*61.8*/flash/*61.13*/.get("success"))),format.raw/*61.28*/("""
					</div> 
				""")))})),format.raw/*63.6*/("""

				<!--show error message-->	
					
				"""),_display_(Seq[Any](/*67.6*/if(flash.get("error").isDefined)/*67.38*/{_display_(Seq[Any](format.raw/*67.39*/("""
					<div class="alert alert-error">
						"""),_display_(Seq[Any](/*69.8*/flash/*69.13*/.get("error"))),format.raw/*69.26*/("""
					</div>
				""")))})),format.raw/*71.6*/("""

		    	"""),_display_(Seq[Any](/*73.9*/content)),format.raw/*73.16*/("""
		    	<!-- """),_display_(Seq[Any](/*74.14*/debug())),format.raw/*74.21*/("""  Call debug template && bring one template from another-->
	  		</div>
  		</div>
	</body>
</html>

"""))}
    }
    
    def render(title:String,content:Html,flash:Flash,lang:Lang): play.api.templates.HtmlFormat.Appendable = apply(title)(content)(flash,lang)
    
    def f:((String) => (Html) => (Flash,Lang) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => (flash,lang) => apply(title)(content)(flash,lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 07 00:07:25 EEST 2014
                    SOURCE: /Users/marko/Dev/products/app/views/main.scala.html
                    HASH: 9416121254019c613147d5ae64f79ec82df6efba
                    MATRIX: 571->1|730->66|872->173|898->178|995->240|1009->246|1064->280|1156->336|1171->342|1232->381|1643->756|1658->762|1693->775|1744->790|1795->819|1890->878|1905->884|1943->900|1989->911|2047->947|2147->1011|2162->1017|2206->1039|2296->1094|2350->1126|2543->1283|2558->1289|2592->1301|2870->1544|2913->1578|2952->1579|3034->1626|3048->1631|3085->1646|3135->1665|3214->1709|3255->1741|3294->1742|3374->1787|3388->1792|3423->1805|3472->1823|3517->1833|3546->1840|3596->1854|3625->1861
                    LINES: 19->1|22->1|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|45->24|45->24|45->24|46->25|46->25|51->30|51->30|51->30|52->31|52->31|57->36|57->36|57->36|59->38|59->38|66->45|66->45|66->45|80->59|80->59|80->59|82->61|82->61|82->61|84->63|88->67|88->67|88->67|90->69|90->69|90->69|92->71|94->73|94->73|95->74|95->74
                    -- GENERATED --
                */
            