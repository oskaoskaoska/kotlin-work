// Task 5.1.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Error: two words required.")
        exitProcess(1)
    }

    val firstWord = args[0]
    val secondWord = args[1]

    if (anagrams(firstWord, secondWord)) {
        println("$firstWord and $secondWord are anagrams.")
    }
    else {
        println("$firstWord and $secondWord are not anagrams.")
    }
}