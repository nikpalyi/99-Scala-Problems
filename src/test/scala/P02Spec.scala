import P02.penultimate
import org.scalatest.Matchers._

class P02Spec extends UnitSpec {

  "penultimate" should "return the second to last element of a list" in {
    penultimate(List(2,4,5,6,6,3,4,5)) shouldBe 4
  }
}

