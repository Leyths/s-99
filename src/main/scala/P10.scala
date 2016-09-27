/**
  * Use the result of problem P09 to implement the so-called run-length encoding data compression method.
  * Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.
  *
  * scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  */
object P10 {

  def runExample() = {
    println(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }

  def encode(list : List[Symbol]) : List[(Int, Symbol)] = list match {
    case Nil => List()
    case _ => partition(list)
  }

  def partition(list: List[Symbol]): List[(Int, Symbol)] = {
    val droppedList = list.dropWhile(v => v == list.head)
    (list.size - droppedList.size, list.head) :: encode(droppedList)
  }
}
