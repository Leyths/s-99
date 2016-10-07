

/**
  * Lotto: Draw N different random numbers from the set 1..M.
  * Example:
  * scala> lotto(6, 49)
  * res0: List[Int] = List(23, 1, 17, 33, 21, 37)
  */
object P24 {

  def runExample() = {
    println(lotto(6, 49))
  }

  def lotto(n : Int, m : Int) : List[Int] = {
    val list = P22.range(1, m)
    P23.randomSelect(n, list)
  }
}
