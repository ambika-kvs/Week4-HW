val x : Double = 42.354562
val y: Int = 3

val roundVal = "%.2f".format(x).toDouble
val leftZero = "%04d".format(y)

println("----------------------------------------------")
println("The value of x is:"+ x)
println("The round value of x is:"+ roundVal)
println("----------------------------------------------")
println("The value of y is:"+ y)
println("The left zero padding version of y is:"+leftZero)
println("----------------------------------------------")

