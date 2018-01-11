import cats.effect.IO
import io.circe.generic.auto._
import hammock._
import hammock.marshalling._
import hammock.jvm.Interpreter
import hammock.circe.implicits._

val rang = "asdfasdf"

val response = Hammock.request(Method.GET, uri"https://api.fidesmo.com/apps", Map()) // In the `request` method, you describe your HTTP request
    .as[List[String]]
    .exec[IO]
