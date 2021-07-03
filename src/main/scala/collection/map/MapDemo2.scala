package collection.map

import scala.collection.mutable

// 取值
object MapDemo2 {
  def main(args: Array[String]): Unit = {


    val map = mutable.Map("1"->"1","2"->"2","name"->"weimin","age"->22)
    println(map)

    println(map("age"))
    // 没有就异常
    //println(map("asdasd"))

    //
    if(map.contains("age")){
      println("存在age")
    }

    if(!map.contains("asdasd")){
      println("不存在")
    }

    //
    val option = map.get("name")
    println(option)
    println(option.get)


    //key 存在就返回对应的值
    // 不存在 就返回指定的默认值
    println(map.getOrElse("asdasd","default"))
  }
}
