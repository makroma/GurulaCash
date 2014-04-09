
package views.html.products

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
object editProduct extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Form[Product],Flash,Lang,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(productForm: Form[Product])(implicit flash: Flash, lang: Lang):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._ 


Seq[Any](format.raw/*1.65*/("""
<!--Form Parameters-->

<!--Twitter Bootstrap helpers-->
"""),format.raw/*7.1*/("""
"""),_display_(Seq[Any](/*8.2*/main(Messages("products.form"))/*8.33*/ {_display_(Seq[Any](format.raw/*8.35*/("""
	<h2>"""),_display_(Seq[Any](/*9.7*/Messages("products.form"))),format.raw/*9.32*/("""</h2>

	<!--Render an HTML form-->
	"""),_display_(Seq[Any](/*12.3*/helper/*12.9*/.form(action = routes.Products.save())/*12.47*/ {_display_(Seq[Any](format.raw/*12.49*/("""
		<fieldset>
			<legend>
				"""),_display_(Seq[Any](/*15.6*/Messages("products.details", Messages("products.new")))),format.raw/*15.60*/("""
			</legend>

			<!--Input elemets-->
			"""),_display_(Seq[Any](/*19.5*/helper/*19.11*/.inputText(productForm("ean")))),format.raw/*19.41*/("""
			"""),_display_(Seq[Any](/*20.5*/helper/*20.11*/.inputText(productForm("name")))),format.raw/*20.42*/("""
			"""),_display_(Seq[Any](/*21.5*/helper/*21.11*/.textarea(productForm("description")))),format.raw/*21.48*/("""
			"""),_display_(Seq[Any](/*22.5*/helper/*22.11*/.inputText(productForm("saldo")))),format.raw/*22.43*/("""

		</fieldset>
		<p><input type="submit" class="btn btn-primary btn-lg" value='"""),_display_(Seq[Any](/*25.66*/Messages("products.new.submit"))),format.raw/*25.97*/("""'></p>
	""")))})),format.raw/*26.3*/(""" 
""")))})),format.raw/*27.2*/("""
"""))}
    }
    
    def render(productForm:Form[Product],flash:Flash,lang:Lang): play.api.templates.HtmlFormat.Appendable = apply(productForm)(flash,lang)
    
    def f:((Form[Product]) => (Flash,Lang) => play.api.templates.HtmlFormat.Appendable) = (productForm) => (flash,lang) => apply(productForm)(flash,lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 07 00:42:41 EEST 2014
                    SOURCE: /Users/marko/Dev/products/app/views/products/editProduct.scala.html
                    HASH: 2a64d279517ef1aaf6abbc7d361ffb848aa044e7
                    MATRIX: 589->1|797->64|881->174|917->176|956->207|995->209|1036->216|1082->241|1154->278|1168->284|1215->322|1255->324|1321->355|1397->409|1475->452|1490->458|1542->488|1582->493|1597->499|1650->530|1690->535|1705->541|1764->578|1804->583|1819->589|1873->621|1990->702|2043->733|2083->742|2117->745
                    LINES: 19->1|25->1|29->7|30->8|30->8|30->8|31->9|31->9|34->12|34->12|34->12|34->12|37->15|37->15|41->19|41->19|41->19|42->20|42->20|42->20|43->21|43->21|43->21|44->22|44->22|44->22|47->25|47->25|48->26|49->27
                    -- GENERATED --
                */
            