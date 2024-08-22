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
