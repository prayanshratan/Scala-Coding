package ds

object DuplicateElements{
  def removeDuplicate(arr: Array[Int], n: Int): Int = {
    if (n == 0 || n == 1) return n
    val temp = new Array[Int](n)
    var j = 0
    for (i <- 0 until n - 1) {
      if (arr(i) != arr(i + 1)) {
        temp({ j += 1; j - 1 }) = arr(i)
      }
    }
    temp({ j += 1; j - 1 }) = arr(n - 1)

    for (i <- 0 until j) {
      arr(i) = temp(i)
    }
    return j
  }

  def main(args: Array[String]): Unit = {
    val arr = Array(123,2454,56,56,56,2,2,6,2,45,6,67,43,443,34,34)
    var length = arr.length
    length = removeDuplicate(arr, length)

    for (i <- 0 until length) {
      System.out.print(arr(i) + " ")
    }
  }
}
