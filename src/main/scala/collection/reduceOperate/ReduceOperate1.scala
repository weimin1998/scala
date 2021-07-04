package collection.reduceOperate

object ReduceOperate1 {
  def main(args: Array[String]): Unit = {
    val ints = List(3,4,2,7)

    val i = ints.reduce(min)
    println(i)

  }
  // 最小值
  def min(i1:Int,i2:Int): Int ={
    if(i1<i2) i1 else i2
  }


}
