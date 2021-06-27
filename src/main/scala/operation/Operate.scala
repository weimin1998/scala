package operation
// scala 没++ --  三目
object Operate {
  def main(args: Array[String]): Unit = {
    var a = 2
    var b = 4

    a = a + b
    b = a - b
    a = a - b
    println(a + "-" + b)

    var x = 3
    var y = 5

    x = x ^ y
    y = x ^ y
    x = x ^ y
    println(x+"-"+y)
  }

}
