package _04_collection

/**
 * 코틀린의 컬렉션은 자바의 컬렉션에서 더 확장된 기능을 제공합니다.
 */

fun main() {
    // 이렇게 쉽게 사용했던 것들이 사실 모두 확장함수였다!
    val map = mapOf(1 to "One", 2 to "Two", 3 to "Three")
    val (key, value) = 1 to "one"
    println("$key: $value")

    val human = "kim" age 33
    println(human.name)
    println(human.age)

    val (name, age)  = "park" age 22
    println(name)
    println(age)
}

infix fun String.age(age: Int): Human =
    Human(this, age)

data class Human(
    val name: String,
    val age: Int
)