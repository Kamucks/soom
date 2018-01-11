import hammock._
// import hammock._

import hammock.jvm.Interpreter
// import hammock.jvm.Interpreter

import hammock.hi._
// import hammock.hi._

import hammock.hi._
// import hammock.hi._

import cats._
// import cats._

import cats.implicits._
// import cats.implicits._

import cats.effect.IO
// import cats.effect.IO

implicit val interp = Interpreter[IO]
// interp: hammock.jvm.Interpreter[cats.effect.IO] = hammock.jvm.Interpreter@7f14cdf3

val opts = (header("user" -> "pepegar") >>> cookie(Cookie("track", "a lot")))(Opts.empty)
// opts: hammock.hi.Opts = Opts(None,Map(user -> pepegar),Some(List(Cookie(track,a lot,None,None,None,None,None,None,None,None))))

val response = Hammock.getWithOpts(uri"http://httpbin.org/get", opts).exec[IO]
// response: cats.effect.IO[hammock.HttpResponse] = IO$638122031
