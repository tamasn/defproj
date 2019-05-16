resolvers += Resolver.sonatypeRepo("releases")

lazy val root = Project("$name;format="normalize"$", file(".")).settings(
  name := "$name$",
  organization := "$organization$",
  scalaOrganization := "org.typelevel",
  scalaVersion := "2.12.4-bin-typelevel-4",
  wartremoverErrors ++= Warts.unsafe,
  scalacOptions ++= Scalac.options,
  scalacOptions in (Compile, console) --= Scalac.consoleOptions,
  libraryDependencies ++= Dependencies.default
)
