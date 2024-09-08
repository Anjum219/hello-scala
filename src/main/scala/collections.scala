@main
def collections() = 
  val list0 = List(1, 2, 3)
  val list1 = (1 to 5).toList
  val list2 = (1 to 5 by 2).toList
  val list3 = (1 until 5).toList
  val list4 = (1 until 6 by 3).toList
  val list5 = List.range(1, 6)
  val list6 = List.range(1, 10, 4)

  println(list0)
  println(list1)
  println(list2)
  println(list3)
  println(list4)
  println(list5)
  println(list6)
