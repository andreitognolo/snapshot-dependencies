import sbt._
import Keys._
import com.bfil.sbt._

object ProjectBuild extends BFilBuild {

  val buildVersion = "0.2.0-SNAPSHOT"
    
  lazy val project = BFilProject("scalescrape", file("."))
  .settings(libraryDependencies ++= Dependencies.all(scalaVersion.value))
}

object Dependencies {
  val akkaVersion = "2.3.9"
  val sprayVersion = "1.3.2"

  def all(scalaVersion: String) = Seq(
    "org.raidenjpa" % "raidenjpa-core" % "0.0.5-SNAPSHOT",
    "com.bfil" %% "scalext" % "0.2.0-SNAPSHOT" changing())
}
