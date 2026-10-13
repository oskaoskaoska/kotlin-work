// Task 4.3: grade calculation using a when expression
import kotlin.system.exitProcess
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: Please provide exactly 3 grades.")
        exitProcess(1)
    }

    val grade1 = args[0].toInt()
    val grade2 = args[1].toInt()
    val grade3 = args[2].toInt()

    val average = (grade1 + grade2 + grade3) / 3.roundToInt()

    val grade = when (average) {
        in 0..39 -> "Fail"
        in 40..69 -> "Pass"
        in 70..100 -> "Distinction"
        else -> "?"
    }

    println("Average mark: $average")
    println("Grade: $grade")
}