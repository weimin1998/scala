package collection.map

import scala.collection.mutable

// 遍历
object MapDemo4 {
  def main(args: Array[String]): Unit = {
    val map = mutable.Map("1"->"1","2"->"2","name"->"weimin","age"->22)

    // 1
    for ((k,v) <-map){
      println(k+"->"+v)
    }

    println("++++++++++++++")
    //2
    for (v<-map.keys){
      println(v)
    }
    println("++++++++++++++")
    //3
    for (v <-map.values){
      println(v)
    }
    println("++++++++++++++")
    //4
    for (v<-map){
      println(v)
    }
  }
}
