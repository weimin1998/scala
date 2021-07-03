package collection.array

// 定长数组 (就和java数组一样)
object ArrayDemo {
  def main(args: Array[String]): Unit = {
    // 指定泛型
    val array = new Array[Int](10)

    array(9) = 10
    println(array.length)


    // apply
    // 初始化的时候赋值， 会自动推断泛型
    var array1 = Array(1, 2, "aaa")

    // 遍历
    for (i <- array1) {
      println(i)
    }

    println(array1)


    // 遍历
    for (i <- 0 until array1.length) {
      println(array1(i))
    }

    // 越界了 array1(10) = 10
  }
}
