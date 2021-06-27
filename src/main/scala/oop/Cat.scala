package oop

object Cat {

  def main(args: Array[String]): Unit = {
    val cat = new Cat
    cat.name = "tom"
    cat.color = "blue"
    cat.age = 3

    val dog = new Dog

  }
}

class Cat {
  var name: String = _
  var color: String = _
  var age: Int = _
}

class Dog{
  var name: String = null
  var color = null
  var age: Int = _
}
