
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
object saleBox extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Product],Flash,Lang,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(products: List[Product])(implicit flash: Flash, lang: Lang):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.62*/("""

<!--Template parameter, List of products && language for localization-->

	<div class="products">
		<p>Click to buy!</p>
		<!--Loop over products parameter-->
    	"""),_display_(Seq[Any](/*8.7*/for(i <- 1 to products.length) yield /*8.37*/ {_display_(Seq[Any](format.raw/*8.39*/("""
    		<div class="col-md-4">
	    		<a href="/buy/:"""),_display_(Seq[Any](/*10.24*/(products(i-1).name))),format.raw/*10.44*/("""" >
		    		<div class="box" style="background-color:"""),_display_(Seq[Any](/*11.51*/Logged/*11.57*/.ranColor)),format.raw/*11.66*/(""";">
		    			<span class="boxlink"></span>
		       		<p>"""),_display_(Seq[Any](/*13.16*/products(i-1)/*13.29*/.name)),format.raw/*13.34*/("""</p>
		      		</div>
	      		</button>
      		</div>
		""")))})),format.raw/*17.4*/("""
	</div>"""))}
    }
    
    def render(products:List[Product],flash:Flash,lang:Lang): play.api.templates.HtmlFormat.Appendable = apply(products)(flash,lang)
    
    def f:((List[Product]) => (Flash,Lang) => play.api.templates.HtmlFormat.Appendable) = (products) => (flash,lang) => apply(products)(flash,lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 09 22:43:05 EEST 2014
                    SOURCE: /Users/marko/Dev/products/app/views/products/saleBox.scala.html
                    HASH: a5a6417c512c9fa09654ea52c6decfce232dea4c
                    MATRIX: 585->1|739->61|940->228|985->258|1024->260|1113->313|1155->333|1245->387|1260->393|1291->402|1385->460|1407->473|1434->478|1524->537
                    LINES: 19->1|22->1|29->8|29->8|29->8|31->10|31->10|32->11|32->11|32->11|34->13|34->13|34->13|38->17
                    -- GENERATED --
                */
            