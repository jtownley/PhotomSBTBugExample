
scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.outworkers"  %% "phantom-dsl" % "2.1.3",
  "org.scalatest"              %% "scalatest"                          % "3.0.1",
  "ch.qos.logback"             %  "logback-classic"                    % "1.1.7"
)

PhantomSbtPlugin.projectSettings