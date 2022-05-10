import P03.kthElementInList
import org.scalatest.Matchers.convertToAnyShouldWrapper

class P03Spec extends UnitSpec {

  "kthElementInList" should "return theKth element from a list" in {
    kthElementInList(4, List(8,88,77,99,9,90,67)) shouldBe 9
  }

}

