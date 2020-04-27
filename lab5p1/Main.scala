package lab5p1

object Main {

  def main(args: Array[String]): Unit = {
    println("Enter first value: ")
    val firstValue = scala.io.StdIn.readLine().toInt
    println("Enter second value: ")
    val secondValue = scala.io.StdIn.readLine().toInt
    printInterval(firstValue+1, secondValue-1)
  }

  def printInterval(from:Int,to: Int){
       println(from)
    if (from < to)
      printInterval(from+1,to)
  }

}

