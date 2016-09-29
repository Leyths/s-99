/**
  *  Insert an element at a given position into a list.
  *
  *  Example:
  *
  *  scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
  *  res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
  */
object P21 {

  def runExample() = {
    println(insertAt('new, 1, List('a, 'b, 'c, 'd)))
    println(insertAtMatch('new, 1, List('a, 'b, 'c, 'd)))
  }

  def insertAt(symbol: Symbol, i: Int, list: List[Symbol]): List[Symbol] = {
    val (a, b) = list.splitAt(i)
    a ::: symbol :: b
  }

  def insertAtMatch(symbol: Symbol, i: Int, list: List[Symbol]): List[Symbol] = list.splitAt(i) match {
    case (a, b) => a ::: symbol :: b
  }

}
