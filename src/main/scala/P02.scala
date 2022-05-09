import scala.annotation.tailrec

object P02 extends App {
  //Find the last but one element of a list.
  def penultimate[A](list: List[A]): A = list.reverse.tail.head

  val numbers: List[Int] = List(1, 2, 3, 4, 5)
  println(penultimate(numbers))
}
