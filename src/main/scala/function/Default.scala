package function

object Default {
  def main(args: Array[String]): Unit = {
    def function1(name:String="weimin",age:Int=22): Unit ={
      println("hello "+name+" "+age)
    }

    function1()
    function1("hhhhh")
    function1(age = 23)
  }

}
