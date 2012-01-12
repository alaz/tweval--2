name := "tweval2"

scalaVersion := "2.8.2"

mainClass in (Compile, run) := Some("TestMain")

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-library" % "2.8.2",
  "org.scala-lang" % "scala-compiler" % "2.8.2",
  "com.twitter" % "util-eval" % "1.12.9")

resolvers += "Twitter Maven2 Repository" at "http://maven.twttr.com"
