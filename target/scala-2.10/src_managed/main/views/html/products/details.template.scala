
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
object details extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Product,Flash,Lang,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*2.2*/(product: Product)(implicit flash: Flash, lang: Lang):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*2.55*/("""

"""),_display_(Seq[Any](/*4.2*/main(Messages("products.details", product.name))/*4.50*/ {_display_(Seq[Any](format.raw/*4.52*/("""

  <h2><!--Barcode tag-->
    """),_display_(Seq[Any](/*7.6*/tags/*7.10*/.barcode(product.ean))),format.raw/*7.31*/("""
    """),_display_(Seq[Any](/*8.6*/Messages("products.details", product.name))),format.raw/*8.48*/("""
  </h2>

  <dl class="dl-horizontal"> <!--Outputs product details-->
    <dt>"""),_display_(Seq[Any](/*12.10*/Messages("ean"))),format.raw/*12.25*/(""":</dt>
    <dd>"""),_display_(Seq[Any](/*13.10*/product/*13.17*/.ean)),format.raw/*13.21*/("""</dd>
    <dt>"""),_display_(Seq[Any](/*14.10*/Messages("name"))),format.raw/*14.26*/(""":</dt>
    <dd>"""),_display_(Seq[Any](/*15.10*/product/*15.17*/.name)),format.raw/*15.22*/("""</dd>
    <dt>"""),_display_(Seq[Any](/*16.10*/Messages("description"))),format.raw/*16.33*/(""":</dt>
    <dd>"""),_display_(Seq[Any](/*17.10*/product/*17.17*/.description)),format.raw/*17.29*/("""</dd>
    <dt>Saldo:</dt>
    <dd>"""),_display_(Seq[Any](/*19.10*/product/*19.17*/.saldo)),format.raw/*19.23*/("""</dd>
  </dl>
""")))})))}
    }
    
    def render(product:Product,flash:Flash,lang:Lang): play.api.templates.HtmlFormat.Appendable = apply(product)(flash,lang)
    
    def f:((Product) => (Flash,Lang) => play.api.templates.HtmlFormat.Appendable) = (product) => (flash,lang) => apply(product)(flash,lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 07 00:46:05 EEST 2014
                    SOURCE: /Users/marko/Dev/products/app/views/products/details.scala.html
                    HASH: 68b8f6ce71cd27cb410286e48b9215454336da07
                    MATRIX: 579->2|726->55|763->58|819->106|858->108|924->140|936->144|978->165|1018->171|1081->213|1196->292|1233->307|1285->323|1301->330|1327->334|1378->349|1416->365|1468->381|1484->388|1511->393|1562->408|1607->431|1659->447|1675->454|1709->466|1780->501|1796->508|1824->514
                    LINES: 19->2|22->2|24->4|24->4|24->4|27->7|27->7|27->7|28->8|28->8|32->12|32->12|33->13|33->13|33->13|34->14|34->14|35->15|35->15|35->15|36->16|36->16|37->17|37->17|37->17|39->19|39->19|39->19
                    -- GENERATED --
                */
            