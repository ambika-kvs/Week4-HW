import scala.io.StdIn.readDouble

object Exercise3 {
  var  num: Double = 0
  var factVal: Int = 0

  def factorial(n: Double): Int = {
    var fact: Int = 1
    val numVal = n.toInt
    for(i <- 1 to numVal)
    {
      fact = fact * i
    }
    fact
  }

  def main(args: Array[String]) {
    print("Enter a number to find the factorial: ")
    try {
      num = readDouble()
      if (num < 0){
        println("Sorry, factorial does not exist for negative numbers")
      }
      else if (num == 0.0){
        println("Factorial of 0 = 1")
      }
      else{
        factVal = factorial(num)
        println("Integer number = "+ num.toInt +" and its factorial = "+factVal)
      }
    }catch {
      case _: NumberFormatException =>
        println("Sorry! given input is not a number")
    }
  }
}
