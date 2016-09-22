/**
  * Find the number of elements of a list.
  */
object P04 {

  def runExample() = {
    val list = List(1, 1, 2, 3, 5, 8)
    println("Built in: " + lengthBuiltIn(list))
    println("Matching: " + lengthMatch(list))
  }

  def lengthBuiltIn(list : List[Int]) : Int = {
    list.size
  }

  def lengthMatch(list : List[Int], count : Int = 0) : Int = list match {
    case Nil => count
    case _ :: tail => lengthMatch(tail, count + 1)
  }
}
