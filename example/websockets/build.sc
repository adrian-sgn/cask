import mill._, scalalib._


trait AppModule extends ScalaModule{
  def scalaVersion = "2.12.6"
  def ivyDeps = Agg(
    ivy"com.lihaoyi::cask:0.0.1",
  )

  object test extends Tests{
    def testFrameworks = Seq("utest.runner.Framework")

    def ivyDeps = Agg(
      ivy"com.lihaoyi::utest::0.6.3",
      ivy"com.lihaoyi::requests::0.1.2",
      ivy"com.github.andyglow::websocket-scala-client:0.2.4"
    )
  }
}