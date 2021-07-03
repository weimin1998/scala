package collection.map

import scala.collection.mutable

// 更新值
object MapDemo3 {
  def main(args: Array[String]): Unit = {


    val map = mutable.Map("1"->"1","2"->"2","name"->"weimin","age"->22)
    println(map)

    // 存在就更新，不存在就添加
    map("name")="Weimin"
    map("ahh")="ahh"

    println(map)

    //
    map +=("AA"->"aa")
    map +=("BB"->"bb","CC"->"cc")

    println(map)


    //删除
    // 可以写多个 要删除的key
    map-=("AA","age")
    println(map)
  }
}
