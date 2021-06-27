package function

object InnerMethod {
  def main(args: Array[String]): Unit = {
    def function1: Unit ={
      println("ok")

      def function1: Unit ={
        println("ok")
      }
    }

    println("hahha")
  }
  def function1: Unit ={
    println("ok")
  }

}
