import org.scalatest.Matchers.convertToAnyShouldWrapper

class P05Spec extends UnitSpec {

  "reverse" should "return a list reversed" in {
    P05.reverse(List(1,2,3,4,5,5,4)) shouldBe List(4,5,5,4,3,2,1)
  }
}

