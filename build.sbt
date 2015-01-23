
name := "FunctionalProgrammingInScala"

version := "1.0"

scalaVersion := "2.11.4"

scalacOptions += "-target:jvm-1.8"

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.12" % "test",
  "org.slf4j" % "slf4j-api" % "1.7.5",
  "org.slf4j" % "slf4j-simple" % "1.7.5"
)

