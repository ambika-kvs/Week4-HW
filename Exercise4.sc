val range = 10
var sum = 0

var num1:Int = 0
var num2:Int = 1

println("The first 10 values of the Fibonacci sequence are....")
println(num1)
println(num2)
for (_ <- 2 until range){
  sum = num1 + num2
  println(sum+" ")
  num1 = num2
  num2 = sum
}