/**
  * Rotate a list N places to the left.
  *
  * Examples:
  * scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
  *
  * scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
  */
object P19 {

  def runExample() = {
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    println(rotate(3, list))
    println(rotate(-2, list))
  }

  def rotate(by : Int, list : List[Symbol]) : List[Symbol] = (by, list) match {
    case (0, _) => list
    case (a, _) if a > 0 => rotate(a - 1, (list :+ list.head).drop(1))
    case (a, _) if a < 0 => rotate(a + 1, list.last :: list.dropRight(1))
  }
}
