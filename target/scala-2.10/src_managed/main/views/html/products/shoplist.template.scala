
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
object shoplist extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Product],Flash,Lang,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(products: List[Product])(implicit flash: Flash, lang: Lang):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.62*/("""
<!--Template parameter, List of products && language for localization-->

	<dl class="products">
		<p>Last months top-sells!</p>
		<!--Loop over products parameter-->
    	"""),_display_(Seq[Any](/*7.7*/for(i <- 1 to products.length) yield /*7.37*/ {_display_(Seq[Any](format.raw/*7.39*/("""

       		<dt>"""),_display_(Seq[Any](/*9.15*/i)),format.raw/*9.16*/(""". """),_display_(Seq[Any](/*9.19*/products(i-1)/*9.32*/.name)),format.raw/*9.37*/("""</dt>
      		<dd>"""),_display_(Seq[Any](/*10.14*/products(i-1)/*10.27*/.description)),format.raw/*10.39*/("""</dd>
		""")))})),format.raw/*11.4*/("""
	</dl>
	"""))}
    }
    
    def render(products:List[Product],flash:Flash,lang:Lang): play.api.templates.HtmlFormat.Appendable = apply(products)(flash,lang)
    
    def f:((List[Product]) => (Flash,Lang) => play.api.templates.HtmlFormat.Appendable) = (products) => (flash,lang) => apply(products)(flash,lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 07 00:03:14 EEST 2014
                    SOURCE: /Users/marko/Dev/products/app/views/products/shoplist.scala.html
                    HASH: 1c776136fd533ca8f8c2b917398d1b6614aa5a71
                    MATRIX: 586->1|740->61|948->235|993->265|1032->267|1083->283|1105->284|1143->287|1164->300|1190->305|1245->324|1267->337|1301->349|1341->358
                    LINES: 19->1|22->1|28->7|28->7|28->7|30->9|30->9|30->9|30->9|30->9|31->10|31->10|31->10|32->11
                    -- GENERATED --
                */
            