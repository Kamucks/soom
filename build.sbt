//import com.sun.tools.javac.resources.version

name:= "soom"

version := "0.1"

scalaVersion := "2.12.4"

scalacOptions += "-Ypartial-unification"


libraryDependencies += "org.typelevel" %% "cats-core" % "1.0.1"
libraryDependencies += "com.pepegar" %% "hammock-core" % "0.8.1"
val circeVersion = "0.9.0"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)


libraryDependencies ++= Seq(
  "com.pauldijou" %% "jwt-core" % "0.14.1"
)
