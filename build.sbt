name := "scala-project"

version := "1.0"

scalaVersion := "2.13.12"

// Library dependencies
libraryDependencies ++= Seq(
  // ScalaTest for unit testing
  "org.scalatest" %% "scalatest" % "3.2.17" % Test
)

// Test configuration to generate XML reports for GitHub Actions
Test / testOptions += Tests.Argument(TestFrameworks.ScalaTest, "-u", "target/test-reports", "-o")

// Show test durations
Test / testOptions += Tests.Argument("-oD")

// Fork tests in a separate JVM
Test / fork := true
