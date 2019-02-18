name := "testcontainer-scala-tags"
organization := "testcontainer.scala.tags"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.4" % "test",
  "org.testcontainers" % "postgresql" % "1.10.6" % "test",
  "com.dimafeng" %% "testcontainers-scala" % "0.22.0" % "test"
)

testOptions in Test += Tests.Argument("-l", "testcontainer.scala.tags.IgnoreTag")