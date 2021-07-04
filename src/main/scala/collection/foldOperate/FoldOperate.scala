package collection.foldOperate

// 运行原理和 reduce一样
// 第一个参数是往集合中对应方向添加的数据
object FoldOperate {
  def main(args: Array[String]): Unit = {
    val ints = List(1, 2, 3, 4)

    val i = ints.foldLeft(5)(sub)
    val i1 = ints.foldRight(5)(sub)

    println(i)
    println(i1)

    // /:  和 :\  操作符等价于上面的方法，但是已经过时了
    val i2 = (5 /: ints) (sub)
    val i3 = (ints :\5 ) (sub)

    println(i2)
    println(i3)
  }

  def sub(i1:Int,i2:Int): Int ={
    i1-i2
  }

}
