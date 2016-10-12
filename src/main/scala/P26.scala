/**
  * Generate the combinations of K distinct objects chosen from the N elements of a list.
  * In how many ways can a committee of 3 be chosen from a group of 12 people?
  * We all know that there are C(12,3) = 220 possibilities (C(N,K) denotes the well-known binomial coefficient).
  * For pure mathematicians, this result may be great. But we want to really generate all the possibilities.
  * Example:
  *
  * scala> combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
  * res0: List[List[Symbol]] = List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'b, 'e), ...
  */
object P26 {

  def runExample() = {
    val combos = combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
    println(combos)
    println("Number of combinations: " + combos.size)
  }

  def combinations(n : Int, list : List[Symbol]) : List[List[Symbol]] = {

    def combos(n: Int, list: List[Symbol]): List[List[Symbol]] = {
      if (n == 1) return list.map(v => List(v))

      var combos = List[List[Symbol]]()
      list.indices.foreach(i => {
        val (a, b) = P20.removeAt(i, list)
        val withoutSym = combinations(n - 1, a)
        combos = combos ::: withoutSym.map(l => b :: l)
      })

      filter(combos)
    }

    def filter(list : List[List[Symbol]], results : List[List[Symbol]] = List()) : List[List[Symbol]] = list match {
      case Nil => results
      case head :: tail if contains(head, results) => filter(tail, results)
      case head :: tail => filter(tail, head :: results)
    }

    def contains(l : List[Symbol], list : List[List[Symbol]]) : Boolean = list match {
      case Nil => false
      case head :: tail if head.forall(sym => l.contains(sym)) => true
      case head :: tail => contains(l, tail)
    }

    combos(n, list)
  }
}