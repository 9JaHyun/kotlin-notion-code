package _04_collection

import java.util.Arrays

/**
 * 코틀린의 컬렉션은 자바의 컬렉션에서 더 확장된 기능을 제공합니다.
 */

fun main() {
    // 이렇게 쉽게 사용했던 것들이 사실 모두 확장함수였다!
    val strings: List<String> = listOf("one", "two", "three")
    val numbers: List<Int> = listOf(1, 2, 3)

    println(strings.last())
    println(numbers.maxOrNull())

    val stringArray = arrayOf("one", "two", "three")
    println(listOf("count together!", stringArray))
    println(listOf("count together!", *stringArray))
}