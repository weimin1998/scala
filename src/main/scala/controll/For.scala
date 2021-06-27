package controll

object For {

  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10) {
      println("haha " + i)
    }


    for (i <- 1 until 10 if i % 2 != 0) {
      println("heihei " + i)
    }


    for (i <- 1 to 10; j = i * 2) {
      println(j)
    }

    for (i <- 1 to 9; j <- 1 to 9) {
      if (i <= j) {
        print(i + "*" + j + "=" + i * j + " ")
        if (j == 9) {
          println()
        }
      }
    }

    for (i <- 1 to 9) {
      print("         "*i)
      for (j <- 1 to 9) {
          if(i<=j){
            print(i + "*" + j + "=" + i * j + "    ")
            if (j == 9) {
              println()
            }
          }
      }
    }


    var arr = for (i <- 1 to 10) yield {
       i*2
    }

    print(arr)
  }
}
