fun fizzBuzz(num: Int): String {
    return when {
        (num % 3 == 0) -> "Fizz"
        (num % 5 ==0 ) -> "Buzz"
        (num % 5 ==0 && num % 3 == 0) -> "FizBuzz"
        else -> "num"
    }
}

/***
 * FizzBuzz is a test
 * to check if number is
 * divided by 3,5, and 15 gives zero or not
 * if it is divisible then print the value
 * if not print number
 */
fun fizzBuzzTest(){
   val num = 100
    for (i in 1..num) {
        when {
            i % 3 == 0 -> {
               print("Fizz\n\n")
            }
            i % 5 == 0 -> {
                print("Buzz\n")
            }
            i%3 ==0 && i%5 == 0 -> {
                print("FizzBuzz\n")
            }
            else -> {
                print("$i\n")
            }
        }
    }
}