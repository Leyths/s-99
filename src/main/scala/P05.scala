/**
  *  Reverse a list.
  */
object P05 {

  def runExample() = {
    val list = List(1, 1, 2, 3, 5, 8)
    println(reverseBuiltIn(list))
    println(reverseMatch(list))
  }

  def reverseBuiltIn(list : List[Int]) : List[Int] = {
    list.reverse
  }

  def reverseMatch(list : List[Int], reversedList : List[Int] = List()) : List[Int] = list match {
    case Nil => reversedList
    case head :: tail => reverseMatch(tail, reversedList.::(head))
  }
}
