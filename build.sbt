resolvers += Resolver.sonatypeRepo("releases")

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.7")

lazy val defproj = (project in file(".")).settings(
  name := "defproj",
  organization := "me.16s",
  scalaOrganization := "org.typelevel",
  scalaVersion := "2.12.4-bin-typelevel-4",
  wartremoverErrors ++= Warts.unsafe,
  scalariformPreferences := scalariformPreferences.value,
  scalacOptions ++= Scalac.options,
  libraryDependencies ++= Dependencies.defaultDependencies
)
