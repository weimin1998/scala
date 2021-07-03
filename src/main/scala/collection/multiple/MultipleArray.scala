package collection.multiple

object MultipleArray {
  def main(args: Array[String]): Unit = {
    val array = Array.ofDim[Int](3, 4)

    array(1)(2) = 3

    // 遍历
    for (item <- array){
      for (subItem <- item){
        print(subItem+"  ")
      }
      println()
    }

    // 遍历
    for (i <- 0 until array.length){
      for (j <- 0 until array(i).length){
        print(array(i)(j)+"  ")
      }
      println()
    }

  }

}
