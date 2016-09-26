/**
  * Pack consecutive duplicates of list elements into sublists.
  * If a list contains repeated elements they should be placed in separate sublists.
  *
  * res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  */
object P09 {

  def runExample() = {
    println(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }

  def pack(list : List[Symbol]) : List[List[Symbol]] = list match {
    case Nil => List()
    case _ => partition(list)
  }

  def partition(list: List[Symbol]): List[List[Symbol]] = {
    val lists = list.partition(v => v == list.head)
    lists._1 :: pack(lists._2)
  }
}
