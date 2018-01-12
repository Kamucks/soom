package soom
package query
import scala.language.higherKinds
import com.softwaremill.sttp._
import soom.JWCToken

object getResponseWithToken {
    def apply(resource: String, token: JWCToken){
      val uriString = s"$baseUrl$resource"
      val request = sttp.get(uri"urlString").header("Authorization",s"Bearer $token")
      request.send()
    }
  }


