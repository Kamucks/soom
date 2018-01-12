import com.softwaremill.sttp.{HttpURLConnectionBackend, Id, SttpBackend}
import pdi.jwt.JwtAlgorithm
package soom
{
import com.softwaremill.sttp.SttpBackend
  case class APIKey(apiKey : String)
  case class Secret(secret : String)
  class Interface(apiKey:String, apiSecret:String) {
  }
  abstract class Backend
  class HTTPURL extends Backend
  class OkHttpSync extends Backend

  trait CanBackend[B <: Backend, R[_], -S]{
    val canBackend : SttpBackend[R,S]
  }


}
package object soom {
  val jwtAlgo: _root_.pdi.jwt.JwtAlgorithm.HS256.type = JwtAlgorithm.HS256
  implicit val backend : SttpBackend[Id, Nothing]= HttpURLConnectionBackend()

  val baseUrl = "https://api.zoom.us/v2/"
  val ms_valid = 60000 //milliseconds valid
  implicit object HTTPURLConnectionCanBackend extends CanBackend[HTTPURL,Id[_],Nothing] {
    val canBackend = HttpURLConnectionBackend()
  }

}

