name:="sbt-app2"
version:="1.0.0"
scalaVersion:="2.12.6"

import sbt._
import Keys._

lazy val root =project.in(file(".")).aggregate(welcomeImpl,utils)

lazy val utils=project

lazy val welcomeImpl = project.settings(name:="welcomeImpl",
			libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.2" % Test)
			.dependsOn(utils)

