package collection.list

import scala.collection.mutable.ListBuffer

// 可变list
object ListBufferDemo {
  def main(args: Array[String]): Unit = {
    val ints = ListBuffer[Int](1, 2, 3)

    println(ints(2))

    for (item <- ints){
      println(item)
    }


    println("+++++++++++++++++++++")
    //
    ints +=4

    //
    ints.append(5)

    for (item <- ints){
      println(item)
    }

    // 这种方式 不会改变ints
    val ints1 = ints :+ 6

    println("========================")
    for (item <- ints1){
      println(item)
    }
  }
}
