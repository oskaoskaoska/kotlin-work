// Task 5.1.2: main program
fun main(args: Array<String>) {
    // If no argument provided, roll default argument
    if (args.size < 1) {
        rollDie()
    }
    else {
        rollDie(args[0].toInt())
    }
}