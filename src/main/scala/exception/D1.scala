package exception

object D1 {
  def main(args: Array[String]): Unit = {
    try {
      var a = 10/0
    }catch {
      case exception: ArithmeticException =>{
        println(exception)
      }
      case exception: Exception=>{
        println("max")
      }
    }finally {
      println("finally")
    }
  }
}
