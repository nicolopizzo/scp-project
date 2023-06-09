ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "org.unibo.scp"

ThisBuild / scalaVersion := "2.12.15"

lazy val root = (project in file("."))
  .settings(
    name := "ParallelClassifiers"
  )

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.3.2",
  "org.apache.spark" %% "spark-sql" % "3.3.2",
  "org.apache.commons" % "commons-math3" % "3.6.1",
  "org.apache.spark" %% "spark-mllib" % "3.3.2"
)