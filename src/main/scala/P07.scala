/**
  * Flatten a nested list structure.
  */
object P07 {

  def runExample() = {
    println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
  }

  def flatten(list : List[Any]) : List[Any] = list flatMap {
    case v: Int => List(v)
    case l: List[Any] => flatten(l)
    case _ => List()
  }
}
