trait Hello {
  def msg: String
  def hi(name: String): String = s"Hi $name, $msg"
}