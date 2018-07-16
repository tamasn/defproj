import sbt._

object Versions {
  val cats = "1.1.0"
  val scalaTest = "3.0.5"
}

object Dependencies {
  val cats = Seq(
    "org.typelevel" %% "cats-core",
    "org.typelevel" %% "cats-kernel",
    "org.typelevel" %% "cats-macros"
  ).map(_ % Versions.cats)

  val scalaTest = Seq(
    "org.scalactic" %% "scalactic" % Versions.scalaTest,
    "org.scalatest" %% "scalatest" % Versions.scalaTest % "test"
  )

  val default = cats ++ scalaTest
}
