/**
  * Drop every Nth element from a list.
  *
  * Example:
  *
  * scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
  */
object P16 {
  def runExample() = {
    println(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

  def drop(n : Int, list : List[Symbol], count : Int = 0) : List[Symbol] = {
    val toDrop = n + ((n - 1) * count)
    list match {
      case _ if toDrop > list.size => list
      case _ =>
        val lists = list.splitAt(toDrop)
        drop(n, lists._1.dropRight(1).++(lists._2), count + 1)
    }
  }
}
