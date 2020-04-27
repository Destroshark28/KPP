package lab5p1

object Main2 {
  def main(args: Array[String]): Unit = {
    println("Enter first value: ")
    val firstValue = scala.io.StdIn.readLine().toInt
    println("Enter second value: ")
    val secondValue = scala.io.StdIn.readLine().toInt
    for (i <- firstValue+1 to secondValue-1) println(i)
  }
}
