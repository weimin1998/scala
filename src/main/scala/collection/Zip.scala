package collection
// 拉链
object Zip {
  def main(args: Array[String]): Unit = {
    val ints1 = List(1, 2, 3)
    val ints2 = List(4, 5, 6)

    // 合并两个集合，每一个元素都是对偶元组
    // 两个集合元素不对应，就会丢失数据
    val list = ints1.zip(ints2)
    println(list)// 对偶元组
  }
}
