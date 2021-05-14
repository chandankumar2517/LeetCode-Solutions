import kotlin.system.measureTimeMillis

fun linearSearchPractice(data: List<Int>, search: Int, size: Int) {
    println("Size of Length is $size")
    val timeInMillis = measureTimeMillis {
        for (i in 0 until size) {
            if (data[i] == search) {
                println("Item found at position ${i}")
                break;  //this command helps to save time and do not allow more iteration once item is found
            }
            println("Array list Position is $i")
        }
    }
    println("(The operation took $timeInMillis ms)")
}


fun maxProfit(pricesOfStock: Array<Int>): Int {
    val size = pricesOfStock.size

    if(size <= 1) {
        return 0
    }

    var min = pricesOfStock[0]
    var max = pricesOfStock[1] - min

    for (i in 2 until size) {
        if(min > pricesOfStock[i - 1]) {
            min = pricesOfStock[i-1]
        }

        if(max < pricesOfStock[i]-min) {
            max = pricesOfStock[i]-min
        }
    }
    return if (max < 0) 0 else max
}
