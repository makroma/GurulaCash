
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
object userHome extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[User,Flash,Lang,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user: User)(implicit flash: Flash, lang: Lang):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._ 


Seq[Any](format.raw/*1.49*/("""
<!--Template parameter, List of products && language for localization-->

"""),format.raw/*6.1*/("""<!--page title and the HTML block are both passed as parameters to main-->

<p>Home</p>
<h4>Welcome """),_display_(Seq[Any](/*9.14*/user/*9.18*/.name)),format.raw/*9.23*/("""! <h4>
<h4>Your current balance is """),_display_(Seq[Any](/*10.30*/user/*10.34*/.balance.balance)),format.raw/*10.50*/(""" €.</h4><br>

<!--page title and the HTML block are both passed as parameters to main-->"""))}
    }
    
    def render(user:User,flash:Flash,lang:Lang): play.api.templates.HtmlFormat.Appendable = apply(user)(flash,lang)
    
    def f:((User) => (Flash,Lang) => play.api.templates.HtmlFormat.Appendable) = (user) => (flash,lang) => apply(user)(flash,lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Apr 06 23:39:55 EEST 2014
                    SOURCE: /Users/marko/Dev/products/app/views/Users/userHome.scala.html
                    HASH: 5f4b0ec93fa931623d4b91fbbc677ade34ee14a2
                    MATRIX: 574->1|766->48|867->175|1003->276|1015->280|1041->285|1113->321|1126->325|1164->341
                    LINES: 19->1|25->1|28->6|31->9|31->9|31->9|32->10|32->10|32->10
                    -- GENERATED --
                */
            