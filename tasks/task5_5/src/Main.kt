// Task 5.1.1: main program
import kotlin.system.exitProcess

// Main function
fun main(args: Array<String>) {
    // Check if two exactly two words are provided
    if (args.size != 2) {
        println("Error: two words required.")
        exitProcess(1)
    }

    // Use infix function to see if two words are anagrams
    if (args[1] anagramOf args[0]) {
        println("${args[0]} and ${args[1]} are anagrams.")
    }
    else {
        println("${args[0]} and ${args[1]} are not anagrams.")
    }
}