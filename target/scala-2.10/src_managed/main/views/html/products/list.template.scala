
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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Product],Flash,Lang,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(products: List[Product])(implicit flash: Flash, lang: Lang):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.62*/("""
<!--Template parameter, List of products && language for localization-->


<!--page title and the HTML block are both passed as parameters to main-->
"""),_display_(Seq[Any](/*6.2*/main(Messages("application.product"))/*6.39*/ {_display_(Seq[Any](format.raw/*6.41*/("""

	<dl class="products">
		<!--Loop over products parameter-->

    	"""),_display_(Seq[Any](/*11.7*/for(product <- products) yield /*11.31*/ {_display_(Seq[Any](format.raw/*11.33*/("""

       		<dt>"""),_display_(Seq[Any](/*13.15*/product/*13.22*/.name)),format.raw/*13.27*/("""</dt>
      		<dd>"""),_display_(Seq[Any](/*14.14*/product/*14.21*/.description)),format.raw/*14.33*/("""</dd>
		""")))})),format.raw/*15.4*/("""
	</dl>
	
	<p> <!--Add button-->
		<a href=""""),_display_(Seq[Any](/*19.13*/controllers/*19.24*/.routes.Products.newProduct())),format.raw/*19.53*/("""" class="btn btn-primary btn-lg">
			<i class="icon-plus icon-white"></i> """),_display_(Seq[Any](/*20.42*/Messages("products.new.command"))),format.raw/*20.74*/(""" >
		</a>
	</p>
""")))})))}
    }
    
    def render(products:List[Product],flash:Flash,lang:Lang): play.api.templates.HtmlFormat.Appendable = apply(products)(flash,lang)
    
    def f:((List[Product]) => (Flash,Lang) => play.api.templates.HtmlFormat.Appendable) = (products) => (flash,lang) => apply(products)(flash,lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 07 00:06:35 EEST 2014
                    SOURCE: /Users/marko/Dev/products/app/views/products/list.scala.html
                    HASH: 817ab54c6ce4e1f59e543379a54a656ff000d1b2
                    MATRIX: 582->1|736->61|922->213|967->250|1006->252|1111->322|1151->346|1191->348|1243->364|1259->371|1286->376|1341->395|1357->402|1391->414|1431->423|1512->468|1532->479|1583->508|1694->583|1748->615
                    LINES: 19->1|22->1|27->6|27->6|27->6|32->11|32->11|32->11|34->13|34->13|34->13|35->14|35->14|35->14|36->15|40->19|40->19|40->19|41->20|41->20
                    -- GENERATED --
                */
            