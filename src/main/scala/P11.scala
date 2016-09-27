/**
  * Modified run-length encoding.
  * Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the
  * result list. Only elements with duplicates are transferred as (N, E) terms.
  * Example:
  *
  * scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
  */
object P11 {

  def runExample() = {
    println(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }

  def encode(list : List[Symbol]) : List[Any] = list match {
    case Nil => List()
    case _ => partition(list)
  }

  def partition(list: List[Symbol]): List[Any] = {
    val droppedList = list.dropWhile(v => v == list.head)
    tuple(list.size - droppedList.size, list.head) :: encode(droppedList)
  }

  def tuple(size : Int, symbol : Symbol) : Any = size match {
    case 1 => symbol
    case _ => (size, symbol)
  }
}
