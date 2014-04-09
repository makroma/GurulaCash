
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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[User],Flash,Lang,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(users: List[User])(implicit flash: Flash, lang: Lang):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.56*/("""
<!--Template parameter, List of products && language for localization-->


<!--page title and the HTML block are both passed as parameters to main-->
<!-- """),format.raw/*6.6*/("""{"""),format.raw/*6.7*/("""

	<dl class="users">
		<!--Loop over products parameter
    	"""),_display_(Seq[Any](/*10.7*/for(user <- users) yield /*10.25*/ {_display_(Seq[Any](format.raw/*10.27*/("""

       		<dt>"""),_display_(Seq[Any](/*12.15*/user/*12.19*/.name)),format.raw/*12.24*/("""</dt>
      		<dd>"""),_display_(Seq[Any](/*13.14*/user/*13.18*/.balance)),format.raw/*13.26*/(""" €</dd>
		""")))})),format.raw/*14.4*/("""
	</dl>
"""),format.raw/*16.1*/("""}"""),format.raw/*16.2*/("""-->"""))}
    }
    
    def render(users:List[User],flash:Flash,lang:Lang): play.api.templates.HtmlFormat.Appendable = apply(users)(flash,lang)
    
    def f:((List[User]) => (Flash,Lang) => play.api.templates.HtmlFormat.Appendable) = (users) => (flash,lang) => apply(users)(flash,lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Apr 06 18:42:26 EEST 2014
                    SOURCE: /Users/marko/Dev/products/app/views/Users/list.scala.html
                    HASH: d5ab852b3c02fb8b6cd58b016cd750acadc4642e
                    MATRIX: 576->1|724->55|906->211|933->212|1031->275|1065->293|1105->295|1157->311|1170->315|1197->320|1252->339|1265->343|1295->351|1337->362|1372->370|1400->371
                    LINES: 19->1|22->1|27->6|27->6|31->10|31->10|31->10|33->12|33->12|33->12|34->13|34->13|34->13|35->14|37->16|37->16
                    -- GENERATED --
                */
            