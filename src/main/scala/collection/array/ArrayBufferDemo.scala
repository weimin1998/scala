package collection.array

import scala.collection.mutable.ArrayBuffer

object ArrayBufferDemo {
  def main(args: Array[String]): Unit = {

    // 可变数组，可以往里追加
    // 类似arraylist
    val arrayBuffer = new ArrayBuffer[Int]()

    arrayBuffer.append(1)
    arrayBuffer.append(2)
    arrayBuffer.append(3)
    arrayBuffer.append(4)

    for (i <- arrayBuffer) {
      println(i)
    }

    arrayBuffer.append(5, 6, 7)

    for (i <- arrayBuffer) {
      println(i)
    }

    // 删除对应下标的值
    arrayBuffer.remove(3)
    for (i <- arrayBuffer) {
      println(i)
    }
  }
}
