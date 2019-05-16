import sbt._

object Versions {
  val cats = "2.0.0-M1"
$if(catsEffect.truthy)$
  val catsEffect = "2.0.0-M1"
$endif$
$if(fs2.truthy)$
  val fs2 = "1.0.4"
$endif$
$if(http4s.truthy)$
    val http4s = "0.20.0"
$endif$
    val scalaTest = "3.0.5"
}

object Dependencies {
  val cats = Seq(
    "org.typelevel" %% "cats-core",
    "org.typelevel" %% "cats-kernel",
    "org.typelevel" %% "cats-macros"
  ).map(_ % Versions.cats)

$if(catsEffect.truthy)$
  val catsEffect = Seq(
    "org.typelevel" %% "cats-effect" % Versions.catsEffect
  )

$endif$
$if(fs2.truthy)$
  val fs2 = Seq(
      "co.fs2" %% "fs2-core",  
      "co.fs2" %% "fs2-io"
    ).map(_ % Versions.fs2)

$endif$
$if(http4s.truthy)$
  val http4s = Seq(
      "org.http4s" %% "http4s-dsl",
      "org.http4s" %% "http4s-blaze-server",
      "org.http4s" %% "http4s-blaze-client"
    ).map(_ % Versions.http4s)

$endif$
  val scalaTest = Seq(
    "org.scalactic" %% "scalactic" % Versions.scalaTest,
    "org.scalatest" %% "scalatest" % Versions.scalaTest % "test"
  )

  val default = cats$if(catsEffect.truthy)$ ++ catsEffect$endif$$if(fs2.truthy)$ ++ fs2$endif$$if(http4s.truthy)$ ++ http4s$endif$ ++ scalaTest
}
