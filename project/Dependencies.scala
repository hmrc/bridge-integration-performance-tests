import sbt._

object Dependencies {

  val test = Seq(
    "com.typesafe"            % "config"                    % "1.4.6" % Test,
    "uk.gov.hmrc"            %% "performance-test-runner"   % "6.3.0" % Test,
    "org.playframework"      %% "play-ahc-ws-standalone"    % "3.0.10",
    "com.github.nscala-time" %% "nscala-time"               % "3.0.0",
    "com.github.mifmif"       % "generex"                   % "1.0.2",
    "org.apache.pekko"       %% "pekko-http"                % "1.3.0",
    "org.apache.pekko"       %% "pekko-stream"              % "1.4.0",
    "io.circe"               %% "circe-core"                % "0.14.15",
    "io.circe"               %% "circe-generic"             % "0.14.15",
    "io.circe"               %% "circe-parser"              % "0.14.15",
    "com.typesafe.play"      %% "play-json"                 % "2.10.8",
    "org.scala-lang.modules" %% "scala-java8-compat"        % "1.0.2",
    "org.scalatest"          %% "scalatest"                 % "3.2.19",
    "org.asynchttpclient"    % "async-http-client"          % "3.0.7"
  )

  val dependencyOverrides = Seq(
    "org.scala-lang.modules" %% "scala-parser-combinators" % "2.4.0",
    "org.slf4j"               % "slf4j-api"                % "2.0.17"
  )
}
