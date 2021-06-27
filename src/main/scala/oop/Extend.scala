package oop

object Extend {
  def main(args: Array[String]): Unit = {
    val father:Father = new Son
  }

}

class Father{

}

class Son extends Father{

}
