organization := "info.daviot"

name := "solution"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.8"

scalacOptions ++= Seq(
  "-deprecation",
  "-target:jvm-1.8",
  "-encoding", "UTF-8"
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.6" % Test
)
