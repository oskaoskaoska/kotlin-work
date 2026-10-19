// Task 5.2.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Check correct num of arguments provided
    if (args.size != 1) {
        println("Error: Provide the radius of the circle")
        exitProcess(1)
    }

    // Get radius from command line
    val radius = args[0].toDouble()

    // Calculate area and perimeter using circle.kt functions
    println("Area: %.4f".format(circleArea(radius)))
    println("Perimeter: %.4f".format(circlePerimeter(radius)))
}