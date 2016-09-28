/**
  * Extract a slice from a list.
  * Given two indices, I and K, the slice is the list containing the elements from and including the Ith element up to
  * but not including the Kth element of the original list. Start counting the elements with 0.
  * Example:
  *
  * scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: List[Symbol] = List('d, 'e, 'f, 'g)
  */
object P18 {

  def runExample() = {
    println(sliceBuiltIn(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
    println(slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

  def sliceBuiltIn(from : Int, to : Int, list : List[Symbol]) : List[Symbol] = {
    list.slice(from, to)
  }

  def slice(from : Int, to : Int, list : List[Symbol]) : List[Symbol] = {
    list.dropRight(list.size - to).drop(from)
  }
}
