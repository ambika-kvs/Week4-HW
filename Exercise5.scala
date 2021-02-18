import scala.io.StdIn.readDouble

object Exercise5 {
  def main(args: Array[String]): Unit = {
    print("Enter a number to find the cube: ")
    try {
      val num = readDouble()
      val cube = findcube(num)
      println("Cube of the given number = "+cube)
    }catch {
      case _: NumberFormatException =>
        println("Sorry! given input is not a number")
    }
  }

  def findcube(x:Double): Double = {
    val cubeVal  = x * x * x
    cubeVal
  }
}
