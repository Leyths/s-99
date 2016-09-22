/**
  * Find the Kth element of a list.
  * By convention, the first element in the list is element 0.
  */
object P03 {

  def runExample() = {
    val list = List(1, 1, 2, 3, 5, 8);
    println("Built in: " + nthBuiltIn(2, list))
    println("Matching: " + nthMatching(2, list))
  }

  def nthBuiltIn(n : Int, list : List[Int]) : Int = {
    list(n - 1)
  }

  def nthMatching(n : Int, list : List[Int], index : Int = 1) : Int = list match {
    case Nil => throw new IndexOutOfBoundsException()
    case x if n == index => x.head
    case _ :: rest => nthMatching(n, rest, index + 1)
  }
}
