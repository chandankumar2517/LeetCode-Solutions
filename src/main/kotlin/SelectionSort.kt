fun main() {
    val data = listOf(
        2,
        9,
        6,
        3,
        7,
        8,
        1,
        5,
        100,
        110,
        112,
        113,
        114,
        115,
        127,
        128,
        129,
        130,
        131,
        116,
        117,
        118,
        119
    )

    println("Started Time ${convertDate(System.currentTimeMillis(), DATE_TIME_HOUR)}")
    println("Input Array value is $data")

    val sortedResult = selectionSort(data.toIntArray())
    println("Selection Sort Array is ${sortedResult.joinToString(separator = " ")}")
    println("Finish Time ${convertDate(System.currentTimeMillis(), DATE_TIME_HOUR)}")
}


fun selectionSort(data: IntArray): IntArray {
    for (i in 0 until (data.size - 1)) {
        var min = i
        for (j in (i + 1) until (data.size)) {

            //check position 0 and 1 element condition and if condition
            //satisfied change min value from i to j
            if (data[j] < data[min]) {
                min = j
            }
        }

        // now swap index values
        val temp = data[i]
        data[i] = data[min]
        data[min] = temp

    }

    return data
}