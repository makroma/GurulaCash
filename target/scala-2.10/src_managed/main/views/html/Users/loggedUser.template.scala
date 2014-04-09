
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
object loggedUser extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[User,Form[Money],Flash,Lang,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user: User)(moneyForm: Form[Money])(implicit flash: Flash, lang: Lang):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._ 


Seq[Any](format.raw/*1.73*/("""
<!--Template parameter, List of products && language for localization-->

"""),format.raw/*6.1*/("""<!--page title and the HTML block are both passed as parameters to main-->
<p>Deposit</p>
<h4>Welcome """),_display_(Seq[Any](/*8.14*/user/*8.18*/.name)),format.raw/*8.23*/("""! <h4>
<h4>Your current balance is """),_display_(Seq[Any](/*9.30*/user/*9.34*/.balance.balance)),format.raw/*9.50*/(""" €.</h4><br>

<!--page title and the HTML block are both passed as parameters to main-->
<section>
	<div class="addValue">
		<!--Deposit-->
		
		"""),_display_(Seq[Any](/*16.4*/helper/*16.10*/.form(action = routes.Logged.deposit())/*16.49*/ {_display_(Seq[Any](format.raw/*16.51*/("""
			<fieldset>
				<legend>
				</legend>

				<!--Input elemets-->
				<div class="moneyForm-left">
					"""),_display_(Seq[Any](/*23.7*/helper/*23.13*/.inputText(moneyForm("Deposit")))),format.raw/*23.45*/("""
				</div>
				<div class="moneyForm-right">
				<input type="submit" class="btn btn-primary" value='deposit'>
				</div>
			</fieldset>
			
		""")))})),format.raw/*30.4*/(""" 
	</div>
</section>
	
"""))}
    }
    
    def render(user:User,moneyForm:Form[Money],flash:Flash,lang:Lang): play.api.templates.HtmlFormat.Appendable = apply(user)(moneyForm)(flash,lang)
    
    def f:((User) => (Form[Money]) => (Flash,Lang) => play.api.templates.HtmlFormat.Appendable) = (user) => (moneyForm) => (flash,lang) => apply(user)(moneyForm)(flash,lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Apr 06 23:39:34 EEST 2014
                    SOURCE: /Users/marko/Dev/products/app/views/Users/loggedUser.scala.html
                    HASH: a040916de8a0cf316a5d72c61b33577d130cc753
                    MATRIX: 588->1|804->72|905->199|1043->302|1055->306|1081->311|1152->347|1164->351|1201->367|1382->513|1397->519|1445->558|1485->560|1627->667|1642->673|1696->705|1872->850
                    LINES: 19->1|25->1|28->6|30->8|30->8|30->8|31->9|31->9|31->9|38->16|38->16|38->16|38->16|45->23|45->23|45->23|52->30
                    -- GENERATED --
                */
            