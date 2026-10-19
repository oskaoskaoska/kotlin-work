// Task 5.3.2: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: Dice spec required, e.g. 2d6")
        exitProcess(1)
    }

    val spec = args[0]
    val numDice = spec.substringBefore('d').toInt()
    val sides = spec.substringAfter('d').toInt()

    rollDice(numDice, sides)
}