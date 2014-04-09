
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
object debug extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Lang,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/()(implicit lang: Lang):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import play.api.Play.current


Seq[Any](format.raw/*1.25*/("""
"""),format.raw/*3.1*/("""
<footer>
	lang = """),_display_(Seq[Any](/*5.10*/lang/*5.14*/.code)),format.raw/*5.19*/(""",
  	user = """),_display_(Seq[Any](/*6.12*/current/*6.19*/.configuration.getString("environment.user"))),format.raw/*6.63*/(""",
  	date = """),_display_(Seq[Any](/*7.12*/(new java.util.Date().format("yyyy-MM-dd HH:mm")))),format.raw/*7.61*/("""
</footer>"""))}
    }
    
    def render(lang:Lang): play.api.templates.HtmlFormat.Appendable = apply()(lang)
    
    def f:(() => (Lang) => play.api.templates.HtmlFormat.Appendable) = () => (lang) => apply()(lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 05 15:07:08 EEST 2014
                    SOURCE: /Users/marko/Dev/products/app/views/debug.scala.html
                    HASH: 0f3e27cae3482f8b3417e1c82be24a0f5121e376
                    MATRIX: 554->1|700->24|727->55|781->74|793->78|819->83|867->96|882->103|947->147|995->160|1065->209
                    LINES: 19->1|23->1|24->3|26->5|26->5|26->5|27->6|27->6|27->6|28->7|28->7
                    -- GENERATED --
                */
            