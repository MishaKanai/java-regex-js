enablePlugins(ScalaJSPlugin)

name := "JavaRegex2Js"
scalaVersion := "2.13.1"

libraryDependencies += "com.lihaoyi" %%% "utest" % "0.7.4" % "test"

testFrameworks += new TestFramework("utest.runner.Framework")

val ESVersion = org.scalajs.linker.interface.ESVersion

scalaJSLinkerConfig ~= {
    _.withModuleKind(ModuleKind.CommonJSModule)
    .withESFeatures(_.withESVersion(ESVersion.ES2018))
}
