import Build._

version := "0.1.0-SNAPSHOT"
scalaVersion := "2.13.12"
organization := "$organization$"
maintainer := "$email$"
val javaVersion = "11"

javacOptions ++= Seq("-source", javaVersion, "-target", javaVersion)

Global / onChangedBuildSource := ReloadOnSourceChanges

lazy val root = (project in file("."))
  .settings(name := "$name$")
  .settings(noPublish)
  .aggregate(core, api)

lazy val core = (project in file("core"))
  .settings(name := "$name$-core")
  .settings(publishSettings)
  .settings(
    libraryDependencies ++= Seq(
      scalaTest
    )
  )

lazy val api = (project in file("api"))
  .settings(name := "$name$-api")
  .settings(publishSettings)
  .settings(
    libraryDependencies ++= Seq(
      scalaTest
    )
  )
  .dependsOn(core)
