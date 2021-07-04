package collection.set

import scala.collection.mutable

object SetDemo {
  def main(args: Array[String]): Unit = {

    // 不可变
    val ints = Set(1, 2, 3)
    println(ints)

    // 可变
    val set = mutable.Set(1, 2, 3)
    println(set)
  }
}
