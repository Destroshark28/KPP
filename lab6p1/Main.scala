package lab6p1

import scala.io.Source

object Main {
  def main(args: Array[String]): Unit = {
    val listFirst = List(45, 12, 65, 66, 300)
    val listSecond = List(1, -12, 42, 32, -321)
    val sortedList = uniteAndSort(listFirst, listSecond)
    println(sortedList)
    println(toStringFold(List(1, -17)))
    val ListForFilet = List("JAVA", "C++", "SCALA")
    println( toFilter(ListForFilet))
  }
  def uniteAndSort(l1: List[Int], l2: List[Int]) : List[Int] = {
    (l1 ++ l2).sortWith((_ < _))
  }

  def toStringFold (startedList: List[Int]): List[String] = {
    val newData = startedList.foldLeft(List[String]()) { (z, curr) =>
      z :+ s"$curr"
    }
    newData
  }

  def toFilter(startedList: List[String]): List[String] ={
    val newData = startedList.filter(x => Seq("++").exists(y => x.endsWith(y)))
    newData
  }

}

/*
  test("Unites and sort 2 lists"){
    val l1 = List(1, 7, 4, 3)
    val l2 = List(1, 0, 2, 4)
    val result = algo.uniteAndSort(l1, l2)
    assert(result.equals(List(0,1,1,2,3,4,4,7)))
  }
* */
