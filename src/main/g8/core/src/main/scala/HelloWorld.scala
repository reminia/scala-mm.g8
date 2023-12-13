class HelloWorld extends Hello {
  def msg: String = "hello world!"
}

object HelloWorld {
  def main(args: Array[String]): Unit = {
    println(new HelloWorld().hi("there"))
  }
}