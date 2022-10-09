package _05_enum

enum class DayOfWeek {
    SUN, MON, TUE, WEN, THU, FRI, SAT
}

fun main() {
    val enum: Int = 5
//    val class: Int = 5 // 컴파일 에러
    println(enum)
}