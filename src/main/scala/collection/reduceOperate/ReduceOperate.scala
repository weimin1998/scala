package collection.reduceOperate

object ReduceOperate {
  def main(args: Array[String]): Unit = {
    val ints = List(1, 2, 3, 4, 5)

    val i = ints.reduceLeft(sum)
    // (((1-2)-3)-4)-5
    println(i)// -13

    val i1 = ints.reduceRight(sum)
    // 1-(2-(3-(4-5)))
    println(i1) // 3

    val strings = List("weimin", "haha", "heihei")
    val str1 = strings.reduceLeft(str)
    val str2 = strings.reduceRight(str)

    println(str1)
    println(str2)
  }

  def sum(i1:Int,i2:Int): Int ={
    //i1+i2
    i1-i2
  }

  def str(s1: String,s2: String): String ={
    s1+s2
  }

}
