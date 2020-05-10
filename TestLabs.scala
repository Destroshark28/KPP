package labsTest

import lab5p2ex.{Extremum, Main}
import lab6p1.Main.uniteAndSort
import lab6p1.Main.toStringFold
import lab6p1.Main.toFilter
import org.scalatest.FunSuite


class AllTest extends FunSuite {

  test("ExtremumWithTailRec.extremum") {
    assert(Extremum.extremumTailRec(List(1, 2, 3, 3)) === (1, 3))
    assert(Extremum.extremumTailRec(List(1, 2)) === (1, 2))
    assert(Extremum.extremumTailRec(List(48, 21, 36, 62)) === (21, 62))
  }

  test("ExtremumWithLoop.extremum") {
    assert(Extremum.extremumNotTail(List(1, 2, 3, 3)) === (1, 3))
    assert(Extremum.extremumNotTail(List(1, 2)) === (1, 2))
    assert(Extremum.extremumNotTail(List(48, 21, 36, 62)) === (21, 62))
  }

  test("Unites and sort 2 lists") {
    val l1 = List(1, 7, 4, 3)
    val l2 = List(1, 0, 2, 4)
    val result = uniteAndSort(l1, l2)
    assert(result === List(0, 1, 1, 2, 3, 4, 4, 7))
  }
  test("ITOA with fold") {
    val list = List(1, 2, 3)
    val result = toStringFold(list)
    assert(result == List("1", "2", "3"))
  }

  test("filter StringList") {
    val ListForFilet = List("JAVA", "C++", "SCALA")
    val result = toFilter(ListForFilet)
    assert(result == List("C++"))
  }
}
