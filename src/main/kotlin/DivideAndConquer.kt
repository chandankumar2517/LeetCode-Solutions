fun main() {
    divideAndConquer(dataListItem, dataListItem.size)
}


fun divideAndConquer(data: List<Int>, size: Int): Int {
    val middlePosition = size.div(2)

    // now from center check left or right number is highest
    when {
        size == 1 -> {
            return 0
        }
        data[0] >= data[1] -> {
            return 0
        }
        data[size-1] >= data[size - 2] -> {
            return size-1
        }
        else -> {
            for (i in 0 until size - 1) {
                if (data[i] >= data[i - 1] && data[i] >= data[i + 1]) {
                    return i

                }
            }
            return 0;

        }
    }

}