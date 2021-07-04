package collection.filterOperate

object FilterOperate {
  def main(args: Array[String]): Unit = {
    val ints = List(1, 2, 3,4,5,6,7,8,9,0)

    val ints1 = ints.filter(filter)

    println(ints1)
  }

  def filter(i:Int): Boolean ={
    i%2==0
  }
}
