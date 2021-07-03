package collection.map

import scala.collection.mutable

object MapDemo {
  def main(args: Array[String]): Unit = {
    // 两种map

    // 不可变，有序
    // 每一个键值对 都是Tuple2
    val map = Map("1"->"1","2"->"2","name"->"weimin","age"->22)
    println(map)

    println(map("1"))
    // 没有的话 就会抛异常
    map("asdasd")




    // 可变，无序
    // scala.collection.mutable
    val immutableMap = mutable.Map("1"->"1","2"->"2","name"->"weimin","age"->22)
    println(immutableMap)

    // 空的映射
    val hashMap = new mutable.HashMap[String, Int]()
    println(hashMap)

    // 对偶元组的方式创建
    // 不可变 有序
    val map4 = Map(("name","weimin"),("age",22),(1,1),(2,2))
    println(map4)
  }
}
