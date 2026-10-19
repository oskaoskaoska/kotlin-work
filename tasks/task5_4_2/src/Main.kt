// Task 5.4.1: main program
import kotlin.system.exitProcess

// Main function
fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: Provide a string")
        exitProcess(1)
    }
    else {
        // Get the input string
        val testString = args[0]
        // Call extension function
        if (testString.isTooLong) {
            println("Error: String is too long")
        exitProcess(1)
        } 
        else {
            println("String is acceptable")
        }
    }
}