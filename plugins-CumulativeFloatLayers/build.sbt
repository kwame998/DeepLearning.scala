enablePlugins(Example)

exampleSuperTypes ~= { oldExampleSuperTypes =>
  import oldExampleSuperTypes._
  updated(indexOf("_root_.org.scalatest.FreeSpec"), "_root_.org.scalatest.AsyncFreeSpec")
}

exampleSuperTypes += "_root_.com.thoughtworks.deeplearning.scalatest.ScalazTaskToScalaFuture"

libraryDependencies += "com.thoughtworks.each" %% "each" % "3.3.1" % Test

scalacOptions += "-Ypartial-unification"
