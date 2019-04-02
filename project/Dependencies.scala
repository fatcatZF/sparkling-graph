package ml.sparkling.graph

import sbt.Keys._
import sbt._

object Dependencies {

  lazy val sparkVersion = settingKey[String]("The version of Spark to use.")

  val Versions = Seq(
    crossScalaVersions := Seq("2.11.7","2.10.6", "2.12.8"),
    scalaVersion := Option(System.getenv().get("TRAVIS_SCALA_VERSION")).getOrElse(crossScalaVersions.value.head),
    sparkVersion := "2.4.0"
  )
  val l = libraryDependencies

  import Compile._
  val r = resolvers
  val graphx = l ++= Seq(Provided.sparkCore.value, Provided.sparkGraphx.value)
  val sparkSQL = l ++= Seq(Provided.sparkSQL.value)
  val sparkMLLib = l ++= Seq(Provided.sparkMLLib.value)
  val sparkCSV = l ++= Seq(Compile.sparkCSV, Provided.sparkSQL.value)
  val sparkXML = l ++= Seq(Compile.sparkXML, Provided.sparkSQL.value)
  val test = l ++= Seq(Compile.Test.scalatest.value,Compile.Test.mockito.value)
  val fastUtils = l ++= Seq(Compile.fastUtils)

  object Compile {
    val fastUtils = "it.unimi.dsi" % "fastutil" % "8.1.0"

    val sparkCSV = "com.databricks" %% "spark-csv" % "1.2.0"
    val sparkXML = "com.databricks" %% "spark-xml" % "0.4.0"

    object Test {
      val scalatest = Def.setting {
        "org.scalatest" %% "scalatest" % "2.2.4" % "test"
      }
      val mockito = Def.setting {
        "org.mockito" % "mockito-all" % "1.10.19" % "test"
      }
    }

    object Provided {
      val sparkCore = Def.setting {
        "org.apache.spark" %% "spark-core" % sparkVersion.value % "provided"
      }
      val sparkGraphx = Def.setting {
        "org.apache.spark" %% "spark-graphx" % sparkVersion.value % "provided"
      }
      val sparkSQL = Def.setting {
        "org.apache.spark" %% "spark-sql" % sparkVersion.value % "provided"
      }
      val sparkMLLib = Def.setting {
        "org.apache.spark" %% "spark-mllib" % sparkVersion.value % "provided"
      }
    }

  }

}
