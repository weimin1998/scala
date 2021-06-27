package function

object Lazy {
  def main(args: Array[String]): Unit = {

    def sum(n1:Int,n2:Int): Int ={
      println("executed")
      n1+n2
    }

    // lazy  cannot var
    lazy val i = sum(3,4)
    //println(i)
  }

}
