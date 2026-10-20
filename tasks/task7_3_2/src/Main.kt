// Task 7.3.1: list element access
fun main() {
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)
    println(numbers)

    numbers[0] = 1
    println(numbers)

    numbers.add(4)
    println(numbers)

    numbers.add(7, 1)
    println(numbers)

    numbers.addAll(listOf(10, 11, 12))
    println(numbers)

    numbers.remove(6)
    println(numbers)

    numbers.removeAll(listOf(10, 11, 12))
    println(numbers)

    numbers.removeAt(0)
    println(numbers)

    numbers.clear()
    println(numbers)   
}   