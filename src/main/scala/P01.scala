/**
  * Find the last element of a list.
  */
object P01 {

  def lastBuiltIn(list : List[Int]) : Int = {
    list.last
  }

  def lastMatch(list : List[Int], lastVal : Int = 0) : Int = list match {
    case x :: rest => lastMatch(rest, x)
    case Nil => lastVal
    case _ => throw new RuntimeException(":(")
  }

  def runExample() = {
    val list = List(1, 1, 2, 3, 5, 8)
    println("Built in : " + lastBuiltIn(list))
    println("Pattern matching: " + lastMatch(list))
  }

}
