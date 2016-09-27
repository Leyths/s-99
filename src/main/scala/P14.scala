/**
  * Duplicate the elements of a list.
  *
  * Example:
  *
  * scala> duplicate(List('a, 'b, 'c, 'c, 'd))
  * res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  */
object P14 {

  def runExample() = {
    println(duplicate(List('a, 'b, 'c, 'c, 'd)))
  }

  def duplicate(list : List[Symbol]) : List[Symbol] = {
    list.flatMap(a => List.fill(2)(a))
  }
}
