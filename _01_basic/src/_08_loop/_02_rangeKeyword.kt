package _08_loop

private val oneToTen = 1..10
private val tenToOne = 10 downTo 1

private val num = 100
private val oneTo = 1 until num

fun main() {
    println(isOneToTen(11))
    println(isSetElement("hello"))
    println(isSetElement("java"))
}

fun isOneToTen(num: Int): Boolean {
    return num in 1..10
}

fun isSetElement(word: String): Boolean {
    return word in setOf("hello", "kotlin")
}