
object P07 {

  // Flatten a nested list structure.
  def flatten(ls: List[Any]): List[Any] = ls flatMap {
    case ms: List[_] => flatten(ms)
    case e => List(e)
  }
}

val deeplyNestedList = List(List(List(1, 2), 3), List(4, List(5, 6)), List(List(List(7)), 8, 9))
val flatList = deeplyNestedList.flatten
// flatList is now List(1, 2, 3, 4, 5, 6, 7, 8, 9)


//Flattening lists is a perfect application for recursive functions,
//and the algorithm shouldn't be too complex.
//The key point in flattening is the possibility to tell apart a list from a non-list element,
//to rule the call of another recursion. To solve this I will probably have to deal with typed patterns.

// reference: https://www.thedigitalcatonline.com/blog/2015/04/07/99-scala-problems-07-flatten/
