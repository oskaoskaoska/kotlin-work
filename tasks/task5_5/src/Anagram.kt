// Task 5.1.1: anagrams() function
// Returns true if two strings are anagrams
infix fun String.anagramOf(that: String): Boolean {
    // Anagrams must be the same length
    if(this.length != that.length) {
        return false
    }
    // Sort the characters of both strings so they would be in the same order
    val thisChars = this.lowercase().toList().sorted()
    val thatChars = that.lowercase().toList().sorted()
    // Compare the sorted character lists
    return thisChars == thatChars
}