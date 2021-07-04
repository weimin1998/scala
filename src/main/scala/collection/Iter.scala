package collection

// 迭代器
object Iter {
  def main(args: Array[String]): Unit = {
    val iterator = List(1, 2, 3, 4, 5).iterator

    for (item<-iterator){
      println(item)
    }
  }
}
