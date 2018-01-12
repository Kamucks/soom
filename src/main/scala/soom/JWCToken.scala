package soom
import pdi.jwt.JwtJson
import play.api.libs.json.Json
class JWCToken(timeStamp : Long)(implicit apiKey : APIKey, secret : Secret) {
  val payload = Json.obj(("iss", apiKey.apiKey), ("exp", timeStamp))
  val token = JwtJson.encode(payload, secret.secret, jwtAlgo)
}
