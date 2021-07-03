package collection.array

import scala.collection.mutable.ArrayBuffer

object ChangeEachOther {
  def main(args: Array[String]): Unit = {
    // 可变数组和不可变数组的相互转换
    // 自身不变，只是返回
    val array = Array(1, 2, 3)

    val arrayBuffer = new ArrayBuffer[Int]

    val buffer = array.toBuffer
    val toArray = arrayBuffer.toArray
  }
}
