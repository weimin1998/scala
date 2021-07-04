package collection.set

import scala.collection.mutable

//
object SetDemo1 {
  def main(args: Array[String]): Unit = {

    // 不可变
    val ints = Set(1, 2, 3)
    println(ints)

    val set = mutable.Set(1, 2, 3)
    println(set)

    // 添加

    set.add(4)
    set+=5
    set+=(6,7,8)
    set+=(6)
    println(set)
    // 删除

    set-=3
    set.remove(4)
    set.remove(100)

    println(set)


    // 遍历
    for (item<-set){
      println(item)
    }
  }
}
