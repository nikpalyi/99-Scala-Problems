
object P07 {

  // Flatten a nested list structure.
  def flatten(ls: List[Any]): List[Any] = ls flatMap {
    case ms: List[_] => flatten(ms)
    case e => List(e)
  }
}

//Flattening lists is a perfect application for recursive functions,
//and the algorithm shouldn't be too complex.
//The key point in flattening is the possibility to tell apart a list from a non-list element,
//to rule the call of another recursion. To solve this I will probably have to deal with typed patterns.

// reference: https://www.thedigitalcatonline.com/blog/2015/04/07/99-scala-problems-07-flatten/
