// Task 5.3.2: rollDice() function
import kotlin.random.Random
import kotlin.system.exitProcess

// Function to roll multiple dice
fun rollDice(numDice: Int = 1, sides: Int = 6) {
    // Check if number valid num of sides
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        // Running total
        var total = 0
        // Rolls once per die
        repeat(numDice) {
            // Adds each roll to the total
            total += Random.nextInt(1, sides + 1)
        }
        println("Rolling $numDice d$sides...")
        println("You rolled a total of $total")
    } 
    else {
        println("Error: Cannot have $sides sides")
        exitProcess(1)
    }
}