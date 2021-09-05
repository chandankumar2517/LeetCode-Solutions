/***
 * function helps to
 * add integer value in an array
 * ex: a[1,4,6,7,9]
 * result = 27
 */

fun addArrayValues(pricesOfStock: Array<Int>): Int {
    var temp = 0

    pricesOfStock.indices.forEach { i ->
        temp += pricesOfStock[i]
    }
    return temp
}