
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Form[scala.Tuple2[String, String]],Html,Flash,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[(String,String)], content: Html)(implicit flash: Flash):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.69*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>Login to Gurulan kassa</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*9.99*/("""">
    </head>
    <body>
    <div id="huge">		
		<div class="container" role="main">
			<div class="jumbotron">
		 		<!--Output page content block-->
				<h1>Gurulan Kassa</h1>

			 	<div class="col-md-4">
			 		<div class="login">
			 			<!--Login page-->
				 		"""),_display_(Seq[Any](/*21.9*/helper/*21.15*/.form(routes.Auth.authenticate)/*21.46*/ {_display_(Seq[Any](format.raw/*21.48*/("""
				 		<div class="form-group">
				  			<input type="username" class="form-control" name="username" placeholder="Username" id="username" value=""""),_display_(Seq[Any](/*23.115*/form("username")/*23.131*/.value)),format.raw/*23.137*/("""">
				  		</div>	
						<div class="form-group">
							<input type="password" class="form-control" name="password" id="password" placeholder="Password">
									
						</div>
						<div class="form-group">
							<button type="submit" class="btn btn-success" id="loginbutton">Login</button>
						</div>	
				    	""")))})),format.raw/*32.11*/("""
			   		</div>
			   	</div>	
			   		<div class="col-md-4">
						<div class="message">
				   			<!--show success message-->

					 		"""),_display_(Seq[Any](/*39.10*/if(flash.get("success").isDefined)/*39.44*/{_display_(Seq[Any](format.raw/*39.45*/("""
								<div class="alert alert-success">
									"""),_display_(Seq[Any](/*41.11*/flash/*41.16*/.get("success"))),format.raw/*41.31*/("""
								</div> 
							""")))})),format.raw/*43.9*/("""

							<!--show error message-->	
								
							"""),_display_(Seq[Any](/*47.9*/if(flash.get("error").isDefined)/*47.41*/{_display_(Seq[Any](format.raw/*47.42*/("""
								<div class="alert alert-error">
									"""),_display_(Seq[Any](/*49.11*/flash/*49.16*/.get("error"))),format.raw/*49.29*/("""
								</div>
							""")))})),format.raw/*51.9*/("""
						</div>


			   		</div>	
			   		<div class="col-md-4">
					"""),_display_(Seq[Any](/*57.7*/content)),format.raw/*57.14*/("""
			   		</div>	
			    	<!-- """),_display_(Seq[Any](/*59.15*/debug())),format.raw/*59.22*/("""  Call debug template && bring one template from another-->
			    	</div>
	  		</div>
  		
  	</div>	
	</body>
</html>

"""))}
    }
    
    def render(form:Form[scala.Tuple2[String, String]],content:Html,flash:Flash): play.api.templates.HtmlFormat.Appendable = apply(form,content)(flash)
    
    def f:((Form[scala.Tuple2[String, String]],Html) => (Flash) => play.api.templates.HtmlFormat.Appendable) = (form,content) => (flash) => apply(form,content)(flash)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 07 01:09:47 EEST 2014
                    SOURCE: /Users/marko/Dev/products/app/views/login.scala.html
                    HASH: 87d3a5caabd5e5597e30914443297b59970db660
                    MATRIX: 595->1|756->68|927->204|941->210|996->244|1087->300|1101->306|1161->345|1462->611|1477->617|1517->648|1557->650|1741->797|1767->813|1796->819|2146->1137|2320->1275|2363->1309|2402->1310|2491->1363|2505->1368|2542->1383|2598->1408|2686->1461|2727->1493|2766->1494|2853->1545|2867->1550|2902->1563|2957->1587|3061->1656|3090->1663|3157->1694|3186->1701
                    LINES: 19->1|22->1|29->8|29->8|29->8|30->9|30->9|30->9|42->21|42->21|42->21|42->21|44->23|44->23|44->23|53->32|60->39|60->39|60->39|62->41|62->41|62->41|64->43|68->47|68->47|68->47|70->49|70->49|70->49|72->51|78->57|78->57|80->59|80->59
                    -- GENERATED --
                */
            