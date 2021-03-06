name := "typebus-kafka"

organization in ThisBuild := "io.surfkit"

scalaVersion in ThisBuild := "2.12.5"

version in ThisBuild := "0.0.5-SNAPSHOT"

lazy val `typebus-kafka` =
  (project in file("."))

val akkaV = "2.5.13"

libraryDependencies ++= Seq(
  "io.surfkit"        %% "typebus" %  "0.0.5-SNAPSHOT",
  "io.surfkit"        %% "typebus-squbs" %  "0.0.5-SNAPSHOT",
  "com.typesafe.akka" %% "akka-stream-kafka" % "1.0-RC1"
)

fork in ThisBuild := true
