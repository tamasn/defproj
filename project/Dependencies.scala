import sbt._

object Dependencies {
  val catsVersion = "1.1.0"
  val defaultDependencies = Seq(
    "org.typelevel" %% "cats-core" % catsVersion,
    "org.typelevel" %% "cats-kernel" % catsVersion,
    "org.typelevel" %% "cats-macros" % catsVersion
  )
}
