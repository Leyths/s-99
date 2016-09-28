/**
  * Split a list into two parts.
  * The length of the first part is given. Use a Tuple for your result.
  * Example:
  *
  * scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  */
object P17 {

  def runExample() = {
    println(splitBuiltIn(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
    println(split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

  def splitBuiltIn(pos : Int, list : List[Symbol]) : (List[Symbol], List[Symbol]) = {
    list.splitAt(pos)
  }

  def split(pos : Int, list : List[Symbol], secondList : List[Symbol] = List()) : (List[Symbol], List[Symbol]) = (pos, list) match {
    case (0, l) => (secondList.reverse, l)
    case (_, Nil) => (Nil, Nil)
    case (n, head :: tail) =>
      split(pos - 1, tail, secondList.::(head))
  }
}
