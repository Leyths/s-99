/**
  * Find the last but one element of a list.
  */
object P02 {

  def runExample() = {
    val list = List(1, 1, 2, 3, 5, 8)
    println("Built in: " + penultimateBuiltIn(list))
    println("Matching: " + penultimateMatching(list))
  }

  def penultimateBuiltIn(list: List[Int]): Int = {
    list.init.last
  }

  def penultimateMatching(list: List[Int]): Int = list match {
    case h :: _ :: Nil => h
    case _ :: tail => penultimateMatching(tail)
    case _ => throw new RuntimeException(":(")
  }
}
