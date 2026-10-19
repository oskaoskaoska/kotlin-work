// Task 5.2.2: conversion of marks into grades, using a function
import kotlin.system.exitProcess
// Function to determine grade based on mark
fun grade(mark: Int) = when (mark) {
    // Check for valid mark range
    in 0..39   -> "Fail"
    in 40..69  -> "Pass"
    in 70..100 -> "Distinction"
    else       -> "?"
}

// Main function
fun main(args: Array<String>) {
    // Check for valid input
    if (args.size < 1) {
        println("Error: Please provide at least one mark.")
        exitProcess(1)
    }
    // Loops over every command line argument
    for (arg in args) {
        // Convert argument to int
        val mark = arg.toInt()
        // Print the mark and its grade
        println("$mark is a ${grade(mark)}")
    }
}