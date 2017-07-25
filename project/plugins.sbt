resolvers += Resolver.url(
  "bintray-stew",
  url("http://dl.bintray.com/stew/plankton"))(
  Resolver.ivyStylePatterns)

addSbtPlugin("io.github.stew"     % "sbt-plankton"           % "0.0.10")
addSbtPlugin("com.eed3si9n"       % "sbt-unidoc"             % "0.3.3")
addSbtPlugin("com.github.gseitz"  % "sbt-release"            % "1.0.0")
addSbtPlugin("com.jsuereth"       % "sbt-pgp"                % "1.0.0")
addSbtPlugin("com.typesafe.sbt"   % "sbt-ghpages"            % "0.5.3")
addSbtPlugin("com.typesafe.sbt"   % "sbt-site"               % "0.8.1")
addSbtPlugin("org.tpolecat"       % "tut-plugin"             % "0.4.7")
addSbtPlugin("pl.project13.scala" % "sbt-jmh"                % "0.2.6")
addSbtPlugin("org.scalastyle"     %% "scalastyle-sbt-plugin" % "0.8.0")
addSbtPlugin("org.scoverage"      % "sbt-scoverage"          % "1.5.0")
addSbtPlugin("com.typesafe.sbt"   % "sbt-git"                % "0.8.5")
addSbtPlugin("org.scala-js"       % "sbt-scalajs"            % "0.6.13")
addSbtPlugin("org.xerial.sbt"     % "sbt-sonatype"           %  "1.1")
addSbtPlugin("io.get-coursier"    % "sbt-coursier"           % "1.0.0-RC6")
