import P08.compress
import org.scalatest.Matchers.convertToAnyShouldWrapper

class P08Spec extends UnitSpec {

  "compress" should "Eliminate consecutive duplicates of list elements" in {
    compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe List('a, 'b, 'c, 'd, 'e)
  }
}

