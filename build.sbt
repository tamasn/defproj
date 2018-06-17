resolvers += Resolver.sonatypeRepo("releases")

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.7")

name := "scalaProject"
organization := "me.16s"
scalaOrganization := "org.typelevel"
scalaVersion := "2.12.4-bin-typelevel-4"
wartremoverErrors ++= Warts.unsafe
scalariformPreferences := scalariformPreferences.value
scalacOptions += "-Ypartial-unification"
libraryDependencies ++= Dependencies.defaultDependencies
