
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
object market extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""

<p>"""),_display_(Seq[Any](/*3.5*/title)),format.raw/*3.10*/("""</p>"""))}
    }
    
    def render(title:String): play.api.templates.HtmlFormat.Appendable = apply(title)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (title) => apply(title)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Apr 06 23:33:20 EEST 2014
                    SOURCE: /Users/marko/Dev/products/app/views/Users/market.scala.html
                    HASH: 7060ccdc8777b6389911837f637de28449ed4f92
                    MATRIX: 563->1|672->16|712->22|738->27
                    LINES: 19->1|22->1|24->3|24->3
                    -- GENERATED --
                */
            