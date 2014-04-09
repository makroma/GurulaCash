
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
object shop extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,Html,Html,Flash,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(user: Html, products: Html)(implicit flash: Flash):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.68*/("""
<!--Parameter list, flash scope, some localization-->

<!DOCTYPE html>
<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*9.99*/("""">
    </head>
    <body>
    <div id="huge">	
		<div class="container" role="main">
			<div class="jumbotron">
		 		<!--Output page content block-->
		 		<div class="header-left">
					<h1>Gurulan Kassa</h1>
				</div>
				<div class="header-right">
					<div class="navigation">
						<a class="btn btn-info" role="button"href=""""),_display_(Seq[Any](/*21.51*/routes/*21.57*/.Logged.welcome)),format.raw/*21.72*/("""" class="home">Home</a>
						<a class="btn btn-success" role="button"href=""""),_display_(Seq[Any](/*22.54*/routes/*22.60*/.Logged.market)),format.raw/*22.74*/("""" class="buy">Buy</a>
						<a class="btn btn-warning" role="button"href=""""),_display_(Seq[Any](/*23.54*/routes/*23.60*/.Logged.depositAction)),format.raw/*23.81*/("""" class="deposit">Deposit</a>
						<a class="btn btn-primary" role="button"href=""""),_display_(Seq[Any](/*24.54*/routes/*24.60*/.Auth.logout)),format.raw/*24.72*/("""" class="logout">logout</a>
					</div>
				</div>
		 		<div class="container">
		 		<!--show success message-->
			 		<div class="col-md-8">
			 		"""),_display_(Seq[Any](/*30.8*/user)),format.raw/*30.12*/("""	
			   		
			   			<div class="message">
				   			<!--show success message-->

					 		"""),_display_(Seq[Any](/*35.10*/if(flash.get("success").isDefined)/*35.44*/{_display_(Seq[Any](format.raw/*35.45*/("""
								<div class="alert alert-success">
									"""),_display_(Seq[Any](/*37.11*/flash/*37.16*/.get("success"))),format.raw/*37.31*/("""
								</div> 
							""")))})),format.raw/*39.9*/("""

							<!--show error message-->	
								
							"""),_display_(Seq[Any](/*43.9*/if(flash.get("error").isDefined)/*43.41*/{_display_(Seq[Any](format.raw/*43.42*/("""
								<div class="alert alert-error">
									"""),_display_(Seq[Any](/*45.11*/flash/*45.16*/.get("error"))),format.raw/*45.29*/("""
								</div>
							""")))})),format.raw/*47.9*/("""
						</div>

					</div>
			   		<div class="col-md-4">
					"""),_display_(Seq[Any](/*52.7*/products)),format.raw/*52.15*/("""
			   		</div>

			    	<!-- """),_display_(Seq[Any](/*55.15*/debug())),format.raw/*55.22*/("""  Call debug template && bring one template from another-->
			    	</div>
  				</div>
  		</div>
  	</div>	
	</body>
</html>

"""))}
    }
    
    def render(title:String,user:Html,products:Html,flash:Flash): play.api.templates.HtmlFormat.Appendable = apply(title)(user,products)(flash)
    
    def f:((String) => (Html,Html) => (Flash) => play.api.templates.HtmlFormat.Appendable) = (title) => (user,products) => (flash) => apply(title)(user,products)(flash)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 08 00:10:11 EEST 2014
                    SOURCE: /Users/marko/Dev/products/app/views/shop.scala.html
                    HASH: 67c3c9a6b1a8982c4faaf635c1a38756cd9d7122
                    MATRIX: 571->1|731->67|872->173|898->178|995->240|1009->246|1064->280|1155->336|1169->342|1229->381|1596->712|1611->718|1648->733|1761->810|1776->816|1812->830|1923->905|1938->911|1981->932|2100->1015|2115->1021|2149->1033|2333->1182|2359->1186|2485->1276|2528->1310|2567->1311|2656->1364|2670->1369|2707->1384|2763->1409|2851->1462|2892->1494|2931->1495|3018->1546|3032->1551|3067->1564|3122->1588|3221->1652|3251->1660|3318->1691|3347->1698
                    LINES: 19->1|22->1|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|42->21|42->21|42->21|43->22|43->22|43->22|44->23|44->23|44->23|45->24|45->24|45->24|51->30|51->30|56->35|56->35|56->35|58->37|58->37|58->37|60->39|64->43|64->43|64->43|66->45|66->45|66->45|68->47|73->52|73->52|76->55|76->55
                    -- GENERATED --
                */
            