class Test

object TestMain {
  def main(args: Array[String]) {
    val eval = new com.twitter.util.Eval
    println("impliedClasspath %s" format eval.impliedClassPath)

    val config = eval.apply[Symbol]( classOf[Test].getClassLoader getResourceAsStream "Config.scala")
    assert('Config == config)
    println("Config "+config)
  }
}
