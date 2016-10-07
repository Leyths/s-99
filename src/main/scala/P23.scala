import scala.util.Random

/**
  * Extract a given number of randomly selected elements from a list.
  *
  * Example:
  *
  * scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
  * res0: List[Symbol] = List('e, 'd, 'a)
  */
object P23 {

  def runExample() = {
    println(randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)))
  }

  def randomSelect[A](count : Int, list : List[A]) : List[A] = (count, list) match {
    case (1, _) => List(P20.removeAt(Random.nextInt(list.size), list)._2)
    case _ =>
      val (a, b) = P20.removeAt(Random.nextInt(list.size), list)
      b :: randomSelect(count - 1, a)
  }
}
