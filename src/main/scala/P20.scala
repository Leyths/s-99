/**
  * Remove the Kth element from a list.
  * Return the list and the removed element in a Tuple. Elements are numbered from 0.
  * Example:
  *
  * scala> removeAt(1, List('a, 'b, 'c, 'd))
  * res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
  */
object P20 {

  def runExample() = {
    println(removeAt(1, List('a, 'b, 'c, 'd)))
  }

  def removeAt[A](k : Int, list : List[A]) : (List[A], A) = {
    val (a, b) = list.splitAt(k)
    (a ::: b.drop(1), b.head)
  }
}
