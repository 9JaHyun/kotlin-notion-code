package _08_loop

import java.util.*

fun main() {
    mapSample()
    listSample()
}

fun mapSample() {
    val binaryReps = TreeMap<Char, String>()

    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.code)
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
}

fun listSample() {
    val list = arrayListOf(10, 20, 30)
    for ((index, element) in list.withIndex()) {
        println("index $index's value is $element")
    }
}
