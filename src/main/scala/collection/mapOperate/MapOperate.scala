package collection.mapOperate

// map映射操作
object MapOperate {
  def main(args: Array[String]): Unit = {
    val ints = List(1, 2, 3)
    val ints1 = ints.map(multiple)
    println(ints1)


    val strings = List("weimin", "haha")
    val strings1 = strings.map(upcase)
    println(strings1)
  }

  def multiple(i: Int): Int = {
    println("调用")
    i * 2
  }

  def upcase(s: String): String = {
    s.toUpperCase
  }
}
