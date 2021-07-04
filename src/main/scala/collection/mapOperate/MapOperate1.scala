package collection.mapOperate

// flat map 扁平化操作
// 将集合中的元素的子元素全部打散
object MapOperate1 {
  def main(args: Array[String]): Unit = {

    val strings = List("weimin", "haha")
    val strings1 = strings.flatMap(upcase)
    println(strings1)
  }


  def upcase(s: String): String = {
    s.toUpperCase
  }
}
