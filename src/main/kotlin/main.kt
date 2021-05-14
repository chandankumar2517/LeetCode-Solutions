fun main() {
    compareTriplet()

    println("Result is : ${fizzBuzz(5)}")
    fizzBuzzTest()

    val data = listOf(2,9,6,3,7,8,1,2,5,100,110,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131)

    val elementSearch = 120
    linearSearchPractice(data, elementSearch,  data.size)

    val pricesOfStock = arrayOf(100, 180, 260, 310, 40, 535, 695)

    val result = maxProfit(pricesOfStock)
    println("Max price of stock $result")
}