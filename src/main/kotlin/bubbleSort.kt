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
    println("UnSorted Array is $data")
    val sortedResult = bubbleSort(data.toIntArray())
    println("Sorted Array is ${sortedResult.joinToString(separator = " ")}")

    getMinAndMaxValue(sortedResult)
}

/***
 * find min and max value
 * in an array as array is already
 * sorted using bubble sort technique
 * now we know at zero and last position are
 * min n max so directly we can print it
 */
fun getMinAndMaxValue(sortedResult: IntArray) {
    println("Minimum value is ${sortedResult[0]}")
    println("Maximum value is ${sortedResult[sortedResult.size - 1]}")
}

/***
 * bubble sort
 * which compare with it's adjacent element and
 * if required it swap and then again iterate
 * https://www.youtube.com/watch?v=o4bAoo_gFBU
 */
fun bubbleSort(data: IntArray): IntArray {
    for (pass in 0 until (data.size - 1)) {

        //create one flag to check if any of the iteration swap is not happening than no need to
        // proceed further to again sort from that place only you can stop your execution logic
        var flag = 0

        // A single pass of bubble mergeSortOptimized
        for (currentPosition in 0 until (data.size - pass - 1)) {
            // This is a single step
            if (data[currentPosition] > data[currentPosition + 1]) {
                val tmp = data[currentPosition]
                data[currentPosition] = data[currentPosition + 1]
                data[currentPosition + 1] = tmp
                flag = 1
            }
            println("current Position $currentPosition")
        }
        println("pass Position $pass")
        // to optimize further this logic has put so that un-necessary iteration does
        // not take place when swapping is already done at minimum iteration
        if (flag == 0) {
            break
        }
    }
    return data
}