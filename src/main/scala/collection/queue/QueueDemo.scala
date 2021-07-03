package collection.queue

import scala.collection.mutable

object QueueDemo {

  def main(args: Array[String]): Unit = {
    val queue = new mutable.Queue[Int]
    println(queue)

    // 追加
    queue+=1

    // 集合拆开 再加到queue
    queue++=List(2,3,4)

    println(queue)


    // 从queue的头部取出元素(弹出)
    // 出队
    val i = queue.dequeue()
    println(i)
    println(queue)

    // 入队 从队列的尾部
    // 可变参数
    queue.enqueue(5,6,7)
    println(queue)


    // 只是拿到元素。对队列没有影响
    // 第一个元素
    println(queue.head)
    // 最后一个元素
    println(queue.last)
    // 除了第一个元素 后面的元素，返回的是队列
    println(queue.tail)



    val cat = new Cat
    cat + 9
    println(cat.age)
  }
}

class Cat{
  var age:Int = _

  // 操作符的重载
  def + (n:Int): Unit ={
    this.age+=n
  }
}
