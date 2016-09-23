/**
  * Find out whether a list is a palindrome.
  */
object P06 {

  def runExample() = {
    println(isPalindrome(List(1, 2, 3, 2, 1)))
    println(isPalindrome(List(1, 5, 3, 2, 1)))
    println(isPalindrome(List()))
    println(isPalindrome(List(1, 2, 2, 1)))
  }

  def isPalindrome(list : List[Int]) : Boolean = list match {
    case Nil => true
    case head :: tail if tail.isEmpty => true
    case head :: tail if head == tail.last => isPalindrome(tail.dropRight(1))
    case _ => false
  }
}
