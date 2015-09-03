package controllers

import play.api._
import play.api.mvc._
import play.api.i18n.I18nSupport
import play.api.i18n.Messages.Implicits._
import play.api.i18n.MessagesApi
import javax.inject.Inject
import play.api.i18n.Lang
import play.api.i18n._
class Application  @Inject() ( val messagesApi: MessagesApi) extends Controller with I18nSupport {

	def index = Action {  implicit request =>
				request.getQueryString("lang") match{
			case Some(lang) =>  messagesApi.setLang(Ok(views.html.index()(messagesApi,Lang(lang))),Lang(lang))
			case None => messagesApi.setLang(Ok(views.html.index()(messagesApi,Lang("en"))),Lang("en"))
		}
	}

}
