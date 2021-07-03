package collection.tuple

object TupleDemo {
  def main(args: Array[String]): Unit = {
    val tuple = (1,2,3,4)
    println(tuple)

    // 使用 _.n 访问对应下标的元素   从1开始的
    println(tuple._1)

    // 使用 方法 访问   从0开始的
    println(tuple.productElement(0))

    // 遍历
    for (item <- tuple.productIterator){
      println(item)
    }
  }
}
