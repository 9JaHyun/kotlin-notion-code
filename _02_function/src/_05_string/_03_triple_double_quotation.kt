package _05_string

fun main() {
    val num = 5
    val str = """
        안녕하세요
        삼중따옴표입니다.
        1 + 4 = $num
    """.trimIndent()
    println(str)
}