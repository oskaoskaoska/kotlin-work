// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Check there is exactly 1 argument provided
    if (args.size != 1) {
        println("Error: Please provide a limit")
        exitProcess(1)
    }

    // Parse the limit to long incase of big limits
    val limit = args[0].toLong()
    // Set starting point for sum. L makes it long
    var sum = 0L

    // Loops through odd numbers up to limit provided
    for (n in 1..limit step 2) {
        // Adds each odd number to the sum
        sum += n
    }

    println("Sum of odd integers from 1 to $limit is: $sum")

}
