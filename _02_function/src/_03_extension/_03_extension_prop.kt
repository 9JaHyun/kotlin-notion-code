package _03_extension

val String.lastChar: Char
    get() = get(length -1)

var StringBuilder.lastChar: Char
    get() = get(length -1)
    set(value: Char) = setCharAt(length - 1, value)


fun main() {
    println("hello".lastChar)
    val sb = StringBuilder("hello?")
    sb.lastChar = '!'
    println(sb.toString())
}