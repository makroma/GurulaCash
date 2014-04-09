
package views.html.Users

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
object addmoney extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Form[Money],Flash,Lang,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(moneyForm: Form[Money])(implicit flash: Flash, lang: Lang):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._ 


Seq[Any](format.raw/*1.61*/("""
<!--Template parameter, List of products && language for localization-->
"""),format.raw/*5.1*/("""
<!--page title and the HTML block are both passed as parameters to main-->
	<div class="addValue">
		<!--Loop over products parameter-->
		<p>rairai</p>
		"""),_display_(Seq[Any](/*10.4*/helper/*10.10*/.form(action = routes.Logged.deposit())/*10.49*/ {_display_(Seq[Any](format.raw/*10.51*/("""
		<fieldset>
			<legend>
			</legend>

			<!--Input elemets-->
			"""),_display_(Seq[Any](/*16.5*/helper/*16.11*/.inputText(moneyForm("Value")))),format.raw/*16.41*/("""


		</fieldset>
		<p><input type="submit" class="btn btn-primary" value='deposit'></p>
	""")))})),format.raw/*21.3*/(""" 
	</div>"""))}
    }
    
    def render(moneyForm:Form[Money],flash:Flash,lang:Lang): play.api.templates.HtmlFormat.Appendable = apply(moneyForm)(flash,lang)
    
    def f:((Form[Money]) => (Flash,Lang) => play.api.templates.HtmlFormat.Appendable) = (moneyForm) => (flash,lang) => apply(moneyForm)(flash,lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Apr 06 19:27:37 EEST 2014
                    SOURCE: /Users/marko/Dev/products/app/views/Users/addmoney.scala.html
                    HASH: d5f0f56b5ac1f4ec9d33f909d843ead9b66e2351
                    MATRIX: 581->1|785->60|885->186|1077->343|1092->349|1140->388|1180->390|1283->458|1298->464|1350->494|1471->584
                    LINES: 19->1|25->1|27->5|32->10|32->10|32->10|32->10|38->16|38->16|38->16|43->21
                    -- GENERATED --
                */
            