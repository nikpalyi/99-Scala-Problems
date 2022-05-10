import P04.numberOfElement
import org.scalatest.Matchers.convertToAnyShouldWrapper

class P04Spec extends UnitSpec {

  "numberOfElement" should "return the number of elements in a list" in {
    numberOfElement(List(2, 2, 4, 6, 5, 8)) shouldBe 6
  }
}

