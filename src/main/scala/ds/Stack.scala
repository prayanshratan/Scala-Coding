package ds

class Stack{
  val MAX = 1000
  var top = -1
  //var top = 0
  val a = new Array[Int](MAX)

  def isEmpty: Boolean = top < 0

  def push(x: Int): Boolean = if (top >= (MAX - 1)) {
    System.out.println("Stack Overflow")
    false
  }
  else {
    a({
      top += 1; top
    }) = x
    System.out.println(x + " pushed into stack")
    true
  }

  def pop: Int = if (top < 0) {
    System.out.println("Stack Underflow")
    0
  }
  else {
    val x = a({
      top -= 1; top + 1
    })
    x
  }

  def peek: Int = if (top < 0) {
    System.out.println("Stack Underflow")
    0
  }
  else {
    val x = a(top)
    x
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val s = new Stack
    s.push(10)
    s.push(20)
    s.push(30)
    System.out.println(s.pop + " Popped from stack")
  }
}
