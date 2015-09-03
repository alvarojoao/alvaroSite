package controllers

import play.api._
import play.api.mvc._
import play.api.i18n.I18nSupport
import play.api.i18n.Messages.Implicits._
import play.api.i18n.MessagesApi
import javax.inject.Inject
import play.api.i18n._
class Application  @Inject() ( val messagesApi: MessagesApi) extends Controller with I18nSupport {




	def index = Action {  implicit request =>
		Ok(views.html.index())
	}

}
