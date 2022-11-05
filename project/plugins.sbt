addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.6.4")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.2.0")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.11.0")
addSbtPlugin("org.portable-scala" % "sbt-scala-native-crossproject" % "1.2.0")
addSbtPlugin("org.scala-native" % "sbt-scala-native" % "0.4.7")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.14")
addSbtPlugin("com.github.sbt" % "sbt-release" % "1.1.0")
addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.2.0")
addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.4.3")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "2.0.6")
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "1.1.1")
addSbtPlugin("org.scoverage" % "sbt-coveralls" % "1.3.2")

libraryDependencies ++= Seq(
  "com.github.plokhotnyuk.jsoniter-scala" %% "jsoniter-scala-macros" % "2.17.5",
  "org.jfree" % "jfreechart" % "1.5.3"
)
