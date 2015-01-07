package controllers

import play.api.mvc._

object Hello extends Controller {

  def sayHello = Action {
    Ok("Hello ScalaPlay!")
  }
}
