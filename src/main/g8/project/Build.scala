import sbt._
import sbt.Keys._

object Build {

  val noPublish = Seq(
    publish / skip := true,
    publishLocal := {},
    publishArtifact := false
  )

  val publishSettings = Seq(
    publishTo := Some("Github repo" at "https://maven.pkg.github.com/" + System.getenv("GITHUB_REPOSITORY")),
    credentials += Credentials(
      "GitHub Package Registry",
      "maven.pkg.github.com",
      System.getenv("GITHUB_REPOSITORY_OWNER"),
      System.getenv("GITHUB_TOKEN")
    ),
    Test / packageDoc / publishArtifact := false,
    Test / packageSrc / publishArtifact := false,
    Test / packageBin / publishArtifact := false,
    Compile / packageDoc / publishArtifact := false
  )

  val scalaTest = "org.scalatest" %% "scalatest" % "3.2.15" % "test"
}