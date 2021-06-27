package exception

object D3 {
  def main(args: Array[String]): Unit = {
    m
  }

  @throws(classOf[NumberFormatException])
  def m: Unit ={
    println("abc".toInt)
  }

}
