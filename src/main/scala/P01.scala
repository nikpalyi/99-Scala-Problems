import scala.annotation.tailrec

object P01 extends App{

  def lastBuiltin[A](ls: List[A]): A = ls.last

  @tailrec
  def lastRecursive[A](ls: List[A]): A = ls match {
    case h :: Nil => h
    case _ :: tail => lastRecursive(tail)
    case _ => throw new NoSuchElementException
  }
}
