/***
 * Approach: The length of the array is n-1.
 * So the sum of all n elements,
 * i.e sum of numbers from 1 to n can be calculated
 * using the formula n*(n+1)/2. Now find the sum of
 * all the elements in the array and subtract it from the sum
 * of first n natural numbers, it will be the value of the missing element.
 */

fun main(args: Array<String>) {
    var allArraySum = 0
    val number = 10
    val arrayOne = arrayOf(1,2,3,4,5,6,8,9,10)

    val sumOfNumbers = findSumOfNaturalNumber(number)
    print("All Summation of natural number $sumOfNumbers\n")

    for (element in arrayOne) {
        allArraySum += element
    }
    print("Summation of array $allArraySum\n")
    val result = sumOfNumbers - allArraySum
    print("Missing Number is $result\n")
}

fun findSumOfNaturalNumber(number: Int): Double {
    return (number * ((number + 1).toDouble()/2))
}