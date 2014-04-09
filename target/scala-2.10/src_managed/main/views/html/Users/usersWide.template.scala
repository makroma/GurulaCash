
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
object usersWide extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[User],Flash,Lang,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(users: List[User])(implicit flash: Flash, lang: Lang):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.56*/("""
<!--Template parameter, List of products && language for localization-->


<!--page title and the HTML block are both passed as parameters to main-->

	<div class="users">
		<!--Loop over products parameter-->
		<p>The welthiest gurus list</p>

    	"""),_display_(Seq[Any](/*11.7*/for(user <- users) yield /*11.25*/ {_display_(Seq[Any](format.raw/*11.27*/("""

       		<div class="name"><h4>"""),_display_(Seq[Any](/*13.33*/user/*13.37*/.name)),format.raw/*13.42*/("""</h4></div>
      		<div class="saldo"><h4>"""),_display_(Seq[Any](/*14.33*/user/*14.37*/.balance.balance)),format.raw/*14.53*/(""" €</h4></div>
		""")))})),format.raw/*15.4*/("""
	</div>
"""))}
    }
    
    def render(users:List[User],flash:Flash,lang:Lang): play.api.templates.HtmlFormat.Appendable = apply(users)(flash,lang)
    
    def f:((List[User]) => (Flash,Lang) => play.api.templates.HtmlFormat.Appendable) = (users) => (flash,lang) => apply(users)(flash,lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 07 00:10:51 EEST 2014
                    SOURCE: /Users/marko/Dev/products/app/views/Users/usersWide.scala.html
                    HASH: 81518f9c016f8ff7f414ce0a3bf33f8082cab61d
                    MATRIX: 581->1|729->55|1016->307|1050->325|1090->327|1160->361|1173->365|1200->370|1280->414|1293->418|1331->434|1379->451
                    LINES: 19->1|22->1|32->11|32->11|32->11|34->13|34->13|34->13|35->14|35->14|35->14|36->15
                    -- GENERATED --
                */
            