name := "playApp"

version := "1.0-SNAPSHOT"

//Fluentlenium Test
unmanagedResourceDirectories in Test <+= baseDirectory ( _ /"target/web/public/test")

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs,
  "org.apache.httpcomponents" % "httpclient" % "4.3.1",
  "org.apache.httpcomponents" % "httpcore" % "4.3.1",
  "commons-beanutils" % "commons-beanutils" % "1.9.2",
  "com.google.inject" % "guice" % "3.0",
  "org.webjars" %% "webjars-play" % "2.3.0-2",
  "org.webjars" % "bootstrap" % "3.1.1-2",
  "org.webjars" % "bootswatch" % "3.2.0-1",
  "org.powermock" % "powermock-module-junit4" % "1.6.1" % "test",
  "org.powermock" % "powermock-api-mockito" % "1.6.1" % "test",
  "org.seleniumhq.selenium" % "selenium-remote-driver" % "2.44.0" % "test",
  "org.seleniumhq.selenium" % "selenium-chrome-driver" % "2.44.0" % "test",
  "org.seleniumhq.selenium" % "selenium-ie-driver" % "2.44.0" % "test",
  "org.seleniumhq.selenium" % "selenium-firefox-driver" % "2.44.0" % "test",
  "org.seleniumhq.selenium" % "selenium-java" % "2.44.0" % "test",
  "org.fluentlenium" % "fluentlenium-core" % "0.10.3" % "test",
  "org.jsoup" % "jsoup" % "1.8.2" % "test",
  "org.apache.pdfbox" % "pdfbox" % "1.8.9"
)
