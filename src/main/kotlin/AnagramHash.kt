/***
 * find ANAGRAM using
 * HASHMAP
 * optimized way
 */

fun anagramHash(firstString: String, secondString: String): Boolean {
    val hashMapOne = HashMap<Char, Int>()
    val hashMapTwo = HashMap<Char, Int>()

    val arr1: CharArray = firstString.toCharArray()
    val arr2: CharArray = secondString.toCharArray()

    for (i in 0 until arr1.size) {
       if(hashMapOne[arr1[i]] == null) {
           hashMapOne[arr1[i]] = 1
       } else {
           var c = hashMapOne[arr1[i]] as Int
           hashMapOne[arr1[i]] = ++c
       }
    }

    for (j in 0 until arr2.size) {
        if(hashMapTwo[arr2[j]] == null) {
            hashMapTwo[arr2[j]] = 1
        } else {
            var c = hashMapTwo[arr2[j]] as Int
            hashMapTwo[arr2[j]] = ++c
        }
    }
    return hashMapOne == hashMapTwo

}

fun toCharacterArray(str: String): CharArray {
    return str.toCharArray()
}

fun main(args: Array<String>) {
    // Get the Strings
    val str1 = "geeksforgeeks"
    val str2 = "forgeeksgeeks"
    showMessage(str1, str2)
}

fun showMessage(str1: String, str2: String) {
    println("Strings to be checked are:\n"
            + str1 + "\n" + str2 + "\n")

    // Find the result
    if (anagramHash(str1, str2))
        println("The two strings are "
                + "anagrams of each other\n")
    else
        println("The two strings are not"
                + " anagrams of each other\n")
}
