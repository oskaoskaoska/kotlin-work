// Task 4.7: finding the longest line in a file
import kotlin.system.exitProcess
import kotlin.io.path.Path
import kotlin.io.path.useLines

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Please provide a file path")
        exitProcess(1)
    }

    val filePath = args[0]
    var longestLength = 0
    var lineNumber = 0
    var longestLineNumber = 0

    // For every line in the file increase lineNumber count by 1
    Path(filePath).useLines {
        for (line in it) {
            lineNumber++
            // If the current line is longer than longest line so far record and update the line length and number
            if (line.length > longestLength) {
                longestLength = line.length
                longestLineNumber = lineNumber
            }
        }
    }

    println("The longest line is: $longestLineNumber")
    println("The length of the longest line is: $longestLength")
}