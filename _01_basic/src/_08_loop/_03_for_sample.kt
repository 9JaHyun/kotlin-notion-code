package _08_loop

private val oneToTen = 1..10
private val tenToOne = 10 downTo 1

private val num = 100
private val oneTo = 1 until num

fun main() {
    for (i in oneToTen) {
        printNumbers(i)
    }

    for (i in tenToOne) {
        printNumbers(i)
    }

    for (i in oneToTen step 2) {
        printNumbers(i)
    }
}

fun printNumbers(num: Int) {
    println("current number is $num")
}
