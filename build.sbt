//import com.sun.tools.javac.resources.version

name:= "soom"

version := "0.1"

scalaVersion := "2.12.4"

scalacOptions += "-Ypartial-unification"

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots")
)
libraryDependencies += "org.typelevel" %% "cats-core" % "1.0.1"
libraryDependencies += "com.pepegar" %% "hammock-core" % "0.8.1"
libraryDependencies += "com.softwaremill.sttp" %% "core" % "1.1.4"
val circeVersion = "0.9.0"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)

libraryDependencies ++= Seq(
  "com.chuusai" %% "shapeless" % "2.3.3"
)

libraryDependencies ++= Seq(
  "com.pauldijou" %% "jwt-play-json" % "0.14.1",
  "com.typesafe.play" %% "play-json" % "2.6.7",
  "com.softwaremill.sttp" %% "okhttp-backend" % "1.1.4"

)
