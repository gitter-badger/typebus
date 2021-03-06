name := "typebus-akka"

organization in ThisBuild := "io.surfkit"

scalaVersion in ThisBuild := "2.12.5"

version in ThisBuild := "0.0.5-SNAPSHOT"

lazy val `typebus-akka` =
  (project in file("."))

val akkaV = "2.5.13"

libraryDependencies ++= Seq(
  "io.surfkit"        %% "typebus" %  "0.0.5-SNAPSHOT",
  "io.surfkit"        %% "typebus-squbs" %  "0.0.5-SNAPSHOT"
)
