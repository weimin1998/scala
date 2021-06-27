package function

object Method2Function {
  def main(args: Array[String]): Unit = {
    val dog = new Dog

    println(dog.sum(1, 3))

    // method parse to function
    val function = dog.sum _

    println(function)

    println(function(40, 20))

    // function
    val f = (i1:Int,i2:Int) =>i1+i2

    println(f(30, 10))
  }

}

class Dog{
  def sum(i1:Int,i2:Int): Int ={
    i1+i2
  }
}
