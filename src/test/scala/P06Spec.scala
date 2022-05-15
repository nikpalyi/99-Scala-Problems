import P06.isPalindrome
import org.scalatest.Matchers.convertToAnyShouldWrapper

class P06Spec extends UnitSpec {

  "isPalindrome" should "return true for List(1, 2, 3, 2, 1)" in {
    isPalindrome(List(1, 2, 3, 2, 1)) shouldBe true
  }
}

