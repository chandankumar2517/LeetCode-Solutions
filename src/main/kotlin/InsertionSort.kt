fun main() {

    //5,2,4,6,1,3
    val names = mutableListOf(8, 3, 2, 7, 4)
    val result = insertionSort(names)
    println("Insertion Sort $result")
}

fun insertionSort(items: MutableList<Int>): List<Int> {

    if (items.isEmpty() || items.size < 2 ) {
        return items
    }


    for (position in 1 until items.count()-1) {
        val item = items[position]
        println("Insertion Sort 1 :- ${items[position]}")
        println("Insertion Sort 2 :- $item")
        var i = position
        println("Insertion Sort 3 :- $i")
        /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */

        while (i > 0 && item < items[i-1]) {
            println("Insertion Sort 4 :- $i")
            println("Insertion Sort 5 :- $item")
            println("Insertion Sort 6 :- ${items[i-1]}")

            items[i] = items[i - 1]
            println("Insertion Sort 7 :- ${items[i]}")
            i -= 1
            println("Insertion Sort 8 :- $i")
        }
        items[i] = item
        println("Insertion Sort 9 :- $item")
        println("Insertion Sort 10 :- ${items[i]}")
    }
    println("Insertion Sort 11 :- $items")
        return items
}