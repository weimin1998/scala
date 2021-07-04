package collection.mapOperate

object HighOrderFun {
  def main(args: Array[String]): Unit = {

    println(test(method, 2))

    // 将函数赋值给一个变量。_表示不执行
    val f = m1 _

    f()
  }


  // 高阶函数
  def test(function: Int => Int, int: Int): Int = {
    function(int)
  }

  def method(i: Int): Int = {
    i * 2
  }


  //
  def m1(): Unit = {
    println("m1")
  }
}
