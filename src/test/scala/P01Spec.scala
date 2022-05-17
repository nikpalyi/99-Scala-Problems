import P01.{lastBuiltin, lastRecursive}
import org.scalatest.Matchers._
import scala.language.postfixOps

class P01Spec extends UnitSpec {
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
    val testList = List[Int]()
    intercept[NoSuchElementException] {lastRecursive(testList)}
    }

  "lastRecursive2" should "throw exception in case of empty list" in {
    val testList = List[Int]()
    assertThrows[NoSuchElementException] {
      lastRecursive(testList)
    }
    }
    // used reference: https://www.scalatest.org/user_guide/writing_your_first_test
}
