package ds

object FibonacciSeries {
  def main(args: Array[String]): Unit = {
    println("The fibonacci series for 10 is: ")
    for(i <- 0 to 10){
      print(fibonacci(i) + " ")
    }
  }
  def fibonacci(number:Int):Int ={
    if(number <= 1){
      return number
    }
    else{
      return fibonacci(number-1)+fibonacci(number-2)
    }
  }
}

