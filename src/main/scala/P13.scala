/**
  * Run-length encoding of a list (direct solution).
  * Implement the so-called run-length encoding data compression method directly. I.e. don't use other methods you've
  * written (like P09's pack); do all the work directly.
  * Example:
  *
  * scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  */
object P13 {

  def runExample() = {
    println(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }

  def encode(list: List[Symbol]): List[(Int, Symbol)] = list match {
    case Nil => List()
    case _ =>
      val droppedList = list.dropWhile(v => v == list.head)
      (list.size - droppedList.size, list.head) :: encode(droppedList)
  }

}
