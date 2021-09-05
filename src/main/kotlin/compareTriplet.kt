/***
 * ANAGRAM -
 * LISTEN = SILENT
 */

fun compareTriplet() {
    val alice = readLine()!!.split("").map { it.toInt() }
    val bob = readLine()!!.split("").map { it.toInt() }

    val compare = alice.mapIndexed { index, value -> value.compareTo(bob[index]) }
    print(compare.count{it > 0})
    print("")
    print(compare.count{it < 0})
}

// Java program to Print all pairs of
// anagrams in a given array of strings
object GFG {
    const val NO_OF_CHARS = 256

    /* function to check whether two
	strings are anagram of each other */
   private fun areAnagram(str1: String, str2: String): Boolean {
        // Create two count arrays and initialize
        // all values as 0
        val count = IntArray(NO_OF_CHARS)

        // For each character in input strings,
        // increment count in the corresponding
        // count array
        var i: Int = 0
        while (i < str1.length && i < str2.length) {
            count[str1[i].toInt()]++
            count[str2[i].toInt()]--
            i++
        }

        // If both strings are of different length.
        // Removing this condition will make the program
        // fail for strings like "aaca" and "aca"
        if (str1.length != str2.length) return false

        // See if there is any non-zero value in
        // count array
        i = 0
        while (i < NO_OF_CHARS) {
            if (count[i] != 0) return false
            i++
        }
        return true
    }

    // This function prints all anagram pairs in a
    // given array of strigns
    fun findAllAnagrams(arr: Array<String>, n: Int) {
        for (i in 0 until n) for (j in i + 1 until n) if (areAnagram(arr[i], arr[j])) println(
            arr[i] +
                    " is anagram of " + arr[j]
        )
    }

    /* Driver program to test to pront printDups*/
    @JvmStatic
    fun main(args: Array<String>) {
        val arr = arrayOf(
            "geeksquiz", "geeksforgeeks",
            "abcd", "forgeeksgeeks",
            "zuiqkeegs"
        )
        val n = arr.size
        findAllAnagrams(arr, n)
    }
}