fun main() {

    val result  = quickSort(dataListItem, 0, dataListItem.size-1)
    print("Quick Sort result is :- ${result}")
}

fun quickSort(dataListItem: List<Int>, low: Int, high: Int) {
    if(low < high) {

        val partitionValue: Int =  partition(dataListItem, low, high)
        quickSort(dataListItem, low, (partitionValue - 1))

        quickSort(dataListItem, (partitionValue + 1), low )
    }
}

fun partition(arrayList: List<Int>, low: Int, high: Int): Int {
    val pivot = arrayList[high]
    return low - 1
}


