// Task 4.2: use of if and ranges
import kotlin.system.exitProcess

fun main() {
    // Prints pizza menu
    println("Pizza Menu:")
    println("(a) Margherita")
    println("(b) Pepperoni")
    println("(c) Veggie")
    println("(d) Hawaiian")
    // Take user input and converts input to lowercase
    val choice = readln().lowercase()

    // Check if users input is valid so 1 character long and in range of 'a' to 'd'
    val message = if (choice.length == 1 && choice[0] in 'a'..'d') {
        "Order accepted"
    // If input is invalid exit
    } else {
        "Invalid choice!"
    }
    println(message)
}
