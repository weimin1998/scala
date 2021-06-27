package function

object ChangableParam {
  // the method is called procedure if its return is Unit
  def main(args: Array[String]): Unit = {

    def sum(p1:Int,arg:Int*): Int ={
      var sum = 0;
      println(arg)
      for (elem <- arg) {
        sum = sum+elem
      }
      sum+p1
    }

    println(sum(1, 2, 3))
  }

}
