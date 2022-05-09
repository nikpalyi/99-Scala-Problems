package org.p99.scala

import org.scalatest._
import org.p99.scala.P01

class P01Spec extends UnitSpec {
  "lastBuiltin" should "return the 7 in the list 1 2 3 4 5 6 7" in {
    val someList = List(1, 2, 3, 4, 5, 6, 7)
    val lastVal = P01.lastBuiltin(someList)
    assert(lastVal == 7)
  }
}

