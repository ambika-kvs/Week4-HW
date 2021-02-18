import scala.io.StdIn.readInt

object Exercise2 {
  var  num: Int = 0
  var factVal: Int = 0

  def factorial(n: Int): Int = {
    var fact: Int = 1
    for(i <- 1 to n)
    {
      fact = fact * i
    }
    fact
  }

  def main(args: Array[String]) {
    print("Enter an integer to find the factorial: ")
    try {
      num = readInt()

      if (num < 0){
        println("Sorry, factorial does not exist for negative numbers")
      }
      else if (num == 0){
        println("Factorial of 0 = 1")
      }
      else{
        factVal = factorial(num)
        println("Factorial of "+num+" = "+factVal)
      }
    }catch {
      case _: NumberFormatException =>
        println("Sorry! given input is not an Integer")
    }
  }
}
