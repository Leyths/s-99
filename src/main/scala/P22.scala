/**
  * Create a list containing all integers within a given range.
  *
  * Example:
  * scala> range(4, 9)
  * res0: List[Int] = List(4, 5, 6, 7, 8, 9)
  */
object P22 {

  def runExample() = {
    println(rangeBuiltIn(4, 9))
    println(range(4, 9))
    println(range(4, 8))
  }

  def rangeBuiltIn(from: Int, to: Int): List[Int] = {
    List.range(from, to + 1)
  }

  def range(from: Int, to: Int): List[Int] = {

    def rangeI(from: Int, to: Int, list : List[Int]) : List[Int] = (from, to) match {
      case (a, b) if from > to => list.reverse
      case (a, b) => rangeI(from + 1, to, from :: list)
    }
    rangeI(from, to, List())
  }

}
