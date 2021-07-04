package collection

import scala.collection.mutable.ArrayBuffer

object Summary {

  def main(args: Array[String]): Unit = {

    test1()
    test2()
  }


  //1.折叠
  def test1(): Unit = {
    val s = "AAAAABBBBBCCCCCDDDDD"

    val arrayBuffer = new ArrayBuffer[Char]()
    val chars = s.foldLeft(arrayBuffer)(put)

    println(chars)//ArrayBuffer(A, A, A, A, A, B, B, B, B, B, C, C, C, C, C, D, D, D, D, D)
  }

  def put(arr: ArrayBuffer[Char], c: Char): ArrayBuffer[Char] = {
    arr.append(c)
    arr
  }

  //
  def test2(): Unit ={
    val s = "AAAAABBBBBCCCCCDDDDD"

    val charToInt = s.foldLeft(Map[Char,Int]())(count)
    println(charToInt)
  }

  def count(map:Map[Char,Int],c:Char): Map[Char,Int] ={
    map+(c->(map.getOrElse(c,0)+1))
  }

  // 3

  def test3(): Unit ={
    List("hello world","aaaa ccc ffff ggggg"," asd asdfz hahah hei")
  }


}
