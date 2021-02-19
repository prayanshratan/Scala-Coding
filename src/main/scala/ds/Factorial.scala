package ds

object Factorial{
  def main(args: Array[String]): Unit = {
    println("Factorial of 5 is " + factorial(5))
    println("Factorial of 10 is " + factorial(10))
  }
  def factorial(number:Int): Int ={
    if(number == 0){
      return 1
    }
    else{
      return number*factorial(number-1)
    }
  }
}
