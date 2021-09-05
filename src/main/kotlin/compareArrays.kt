/**
 * normal using loop
 */

fun compareArraysFirstSolution(aliceArray: Array<Int>, bobArray: Array<Int>): Array<Int> {
    var scoreAlice = 0
    var scoreBob = 0

    for (i in 0..3) {
        if (aliceArray[i] > bobArray[i]) scoreAlice += 1
        if(aliceArray[i] < bobArray[i]) scoreBob += 1
    }
    return arrayOf(scoreAlice, scoreBob)
}

/**
 * using zip function code reduced
 */
fun compareArraysFirstSecond(aliceArray: Array<Int>, bobArray: Array<Int>): Array<Int> {
    val scoreAlice = aliceArray.zip(bobArray).count { it.first > it.second }
    val scoreBob = aliceArray.zip(bobArray).count { it.second > it.first }
    return arrayOf(scoreAlice, scoreBob)
}



fun main() {
    //val aliceArray = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    //val bobArray = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val aliceArray = arrayOf(1, 11, 60, 9)
    val bobArray = arrayOf(10, 5, 69, 90)

    val result = compareArraysFirstSolution(aliceArray, bobArray)
    println("result ${result[0]}, ${result[1]}")
}