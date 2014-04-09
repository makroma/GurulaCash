
package views.html.tags

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
object barcode extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Long,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*2.2*/(ean: Long):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*2.13*/("""
<img class="barcode" alt=""""),_display_(Seq[Any](/*3.28*/ean)),format.raw/*3.31*/("""" src=""""),_display_(Seq[Any](/*3.39*/routes/*3.45*/.Barcodes.barcode(ean))),format.raw/*3.67*/("""">"""))}
    }
    
    def render(ean:Long): play.api.templates.HtmlFormat.Appendable = apply(ean)
    
    def f:((Long) => play.api.templates.HtmlFormat.Appendable) = (ean) => apply(ean)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 05 15:33:15 EEST 2014
                    SOURCE: /Users/marko/Dev/products/app/views/tags/barcode.scala.html
                    HASH: d423e58bc909c6372b5bc356cca96fdb7b9f40be
                    MATRIX: 561->2|666->13|729->41|753->44|796->52|810->58|853->80
                    LINES: 19->2|22->2|23->3|23->3|23->3|23->3|23->3
                    -- GENERATED --
                */
            