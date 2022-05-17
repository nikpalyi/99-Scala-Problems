

import P07.flatten
import org.scalatest.Matchers.convertToAnyShouldWrapper
import org.scalatest._

class P07Spec extends UnitSpec {

  "flatten" should "flatten the nested list" in {
    flatten(List(List(1, 1), 2, List(3, List(5, 8)))) shouldBe  List(1, 1, 2, 3, 5, 8)
  }
}

