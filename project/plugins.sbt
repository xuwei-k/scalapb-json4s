addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.2")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.11")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.5")

addSbtPlugin("com.thesamet" % "sbt-protoc" % "0.99.23")
libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.9.0-M7"

addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.3.0")
