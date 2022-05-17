
object P06 {

  // Find out whether a list is a palindrome.
  def isPalindrome[A](list: List[A]) : Boolean = list == list.reverse
}
