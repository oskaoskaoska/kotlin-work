// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Making sure exactly 3 arguments are received
    if (args.size != 3) {
        println("Error: Please provide exactly 3 arguments: Initial Temperature, Maximum Temperature and a Temperature Increment.")
        exitProcess(1)
    }

    // Parsing command line arguments
    val initialTemp = args[0].toDouble()
    val maxTemp = args[1].toDouble()
    val increment = args[2].toDouble()

    // Sets the start of counter
    var celsius = initialTemp
    // Loops through until max
    while (celsius <= maxTemp) {
        val fahrenheit = celsius * 9/5 + 32
        // Prints the current Celsius and Fahrenheit values
        println("%7.1f %7.1f".format(celsius, fahrenheit))
        // Increments the Celsius value
        celsius += increment
    }

}
