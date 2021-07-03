package oop

object Constructor {
  def main(args: Array[String]): Unit = {
    val person = new Person("weimin", 22)
    println(person)
  }
}


class Person(inName:String,inAge:Int){
  var name: String = inName
  var age: Int = inAge

  def this(name:String){
    this("",0)
    this.name  = name
  }

  override def toString: String = {
    "info:"+name+","+age
  }

  println(age)
}
