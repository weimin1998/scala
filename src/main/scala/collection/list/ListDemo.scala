package collection.list

// list是不可变的  seq
object ListDemo {
  def main(args: Array[String]): Unit = {
    val ints = List(1, 2, 3)
    println(ints)

    // 空集合
    val nil = Nil
    println(nil)

    // 访问对应下标的元素
    println(ints(2))

    // 向后追加
    // 本身的list没有变化
    var list = ints:+4
    println(list)
    println(ints)

    var list2 = 0 +:ints
    println(list2)


    // ::的使用

    var list3 = 4::5::6::ints::7::nil

    println(list3)


    // :::
    var list4 = 4::5::6::ints:::7::nil
    println(list4)
  }

}
