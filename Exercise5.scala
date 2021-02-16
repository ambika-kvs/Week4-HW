import scala.io.StdIn.readDouble
import scala.sys.exit

object Exercise5 {
  def main(args: Array[String]): Unit = {
    print("Enter a number to find the cube: ")
    try {
      val num = readDouble()
      val cube = findcube(num)
      println("Cube of the given number = "+cube)
    }catch {
      case _: NumberFormatException =>
        println("Sorry! given input is not an Integer")
        exit(1)
    }
  }

  def findcube(x:Double): Double = {
    val cubeVal  = x * x * x
    cubeVal
  }
}
