import P01.lastBuiltin
import org.scalatest.Matchers.convertToAnyShouldWrapper

class P01Spec extends UnitSpec {
  "lastBuiltin" should "return the last element of a list" in {
    lastBuiltin(List(2, 4, 6, 5, 4, 7, 6)) shouldBe 6
  }
}