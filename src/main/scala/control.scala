val qwe1 = 12

@main
def control() =
  // if statement
  if qwe1 > 10 then
    println("greather")
  else if qwe1 == 10 then
    println("equal")
  else
    println("smaller")

  // for loops
  val ints = List(1, 2, 3, 4)
  for i <- ints do println(i)
  for
    i <- ints
    if i >= 3
  do
    println(i)

  for
    i <- 1 to 3
    j <- 'a' to 'c'
    if i == 1
    if j == 'a'
  do
    println(s"i = $i, j = $j")

  // for expression
  val strings = List("apple", "banana", "orange")
  val longCapStrings = for
    str <- strings
    if str.length > 5
  yield
    str.capitalize
  println(longCapStrings)

  // match expression
  val tuples = List((1, "one"), (-2, "two"), (-9, "nine"), (0), ("tutu"))
  val results = tuples.map(tuple => tuple match
    case (a: Int, b: String) if a > 0 => s"positive $b"
    case (a: Int, b: String) if a < 0 => s"negative $b"
    case (a: Int, b: String) if a == 0 => "zero"
    case (a: Int) => a
    case _ => "others"
  )
  println(results)
