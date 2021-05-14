/**
 * binary search is always advisable to
 * apply on sorted array it works faster
 *
 * it works on divide and conquer technique
 * it recursively divide list
 *
 * worst case time complexity is o(log n)
 * best case time complexity is o(1)
 */

fun main() {
    val data = listOf(
        2,
        9,
        6,
        3,
        7,
        8,
        1,
        2,
        5,
        100,
        110,
        112,
        113,
        114,
        115,
        116,
        117,
        118,
        119,
        120,
        121,
        122,
        123,
        124,
        125,
        126,
        127,
        128,
        129,
        130,
        131
    )
    val searchItem = 5
    val left = 0
    val right = data.size - 1

    val sortedData = data.sorted()

    println("Sorted array is $sortedData")
    println("Element to be searched inside Array $searchItem")

    val recursiveResult: Int = binarySearchWithRecursive(sortedData, left, right, searchItem)
    if (recursiveResult != -1) {
        println("Element is found recursive way $recursiveResult")
    } else {
        println("Element is not found recursive way at index $recursiveResult")
    }

    val result = binarySearchWithoutRecursive(sortedData, searchItem)

    if (result != -1) {
        println("Element is found without recursive way $result")
    } else {
        println("Element is not found at index $result")
    }
}

/***
 * find item
 * in an array using recursive way
 *
 */
fun binarySearchWithRecursive(data: List<Int>, left: Int, right: Int, search: Int): Int {
    while (right >= left) {
        val middle = left + (right - left).div(2)
        if (search == data[middle]) {
            return middle
        }
        if (data[middle] > search) {
            //left side search from middle
            return binarySearchWithRecursive(data, left, (middle - 1), search)
        }
        //only on right side search from middle
        return binarySearchWithRecursive(data, (middle + 1), right, search)
    }
    // We reach here when element is not present
    // in array
    return -1
}

/***
 * find item in an
 * array without recursive
 */
fun binarySearchWithoutRecursive(sortedData: List<Int>, searchItem: Int): Int {
    var left = 0
    var right = sortedData.size - 1

    while (left <= right) {
        val middle = left + (right - left).div(2)
        if (sortedData[middle] == searchItem)
            return middle
        if (sortedData[middle] < searchItem)
            left = middle + 1
        else
            right = middle - 1

    }
    return -1
}
