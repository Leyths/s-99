/**
  * Eliminate consecutive duplicates of list elements.
  */
object P08 {

  def runExample() = {
    println(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }

  def compress(list : List[Symbol], chars : List[Symbol] = List()) : List[Symbol] = list match {
    case head :: tail if chars.nonEmpty && head == chars.last => compress(tail, chars)
    case head :: tail => compress(tail, chars :+ head)
    case Nil => chars
  }
}
