package collection.scanOperate

object ScanOperate {

  def main(args: Array[String]): Unit = {
    val ints = List(1, 2, 3, 4, 5)

    val ints1 = ints.scanLeft(5)(sub)

    // 5
    // 5-1 = 4
    // 4-2 = 2
    // 2-3 = -1
    // -1-4 = -5
    // -5-5 = -10
    println(ints1)//List(5, 4, 2, -1, -5, -10)

    val ints2 = ints.scanRight(5)(add)
    //                 5
    //          5+5=10
    //      10+4=14
    //    14+3=17
    // 17+2=19
    //19+1=20
    println(ints2)//List(20, 19, 17, 14, 10, 5)
  }

  def sub(i1: Int, i2: Int): Int = {
    i1 - i2
  }
  def add(i1: Int, i2: Int): Int = {
    i1 + i2
  }


}
