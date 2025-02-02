import P01.{lastBuiltin, lastRecursive}
import org.scalatest.Matchers._
import scala.language.postfixOps

class P01Spec extends UnitSpec {

  val dummyEmptyList = List[Int]()

  "lastBuiltin" should "return the last element of a list" in {
    lastBuiltin(List(2, 4, 6, 5, 4, 7, 6)) shouldBe 6
  }

  "lastRecursive" should "return last e of list" in {
    lastRecursive(List(7, 7)) shouldBe 7
  }

  "lastRecursive" should "return last the e of list" in {
    lastRecursive(List(7)) shouldBe 7
  }

  "lastRecursive1" should "throw exception in case of empty list" in {
    intercept[NoSuchElementException] {lastRecursive(dummyEmptyList)}
    }

  "lastRecursive2" should "throw exception in case of empty list" in {
    assertThrows[NoSuchElementException] {
      lastRecursive(dummyEmptyList)
    }
    }
    // used reference: https://www.scalatest.org/user_guide/writing_your_first_test
}
