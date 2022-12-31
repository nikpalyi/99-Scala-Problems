
object P09 {

  //Pack consecutive duplicates of list elements into sub lists.
  // If a list contains repeated elements they should be placed in separate sublists.

//  def pack(list : List[A]) : list[A] = ???
}


def pack[A](list: List[A]): List[List[A]] = list match {
  case Nil => Nil  // Base case: return an empty list if the input list is empty
  case x :: xs =>  // Pattern match the head and tail of the list
    val (duplicates, rest) = xs.span(_ == x)  // Find the consecutive duplicates and the rest of the list
    (x :: duplicates) :: pack(rest)  // Pack the duplicates into a sublist and recurse on the rest of the list
}


val list = List(1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5)
val packed = pack(list)
// packed is now List(List(1, 1, 1), List(2, 2), List(3, 3, 3, 3), List(4, 4), List(5, 5, 5, 5, 5))
