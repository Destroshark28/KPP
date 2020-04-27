package lab5p2ex

object Main {

    def main(args: Array[String]) {
      val list = List(45,12,65,66,300)

      println(Extremum.extremumNotTail(list))
      println(Extremum.extremumTailRec(list))

  }
}
