package _09_Exception

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

private fun reader(reader: BufferedReader) {
    val num = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        println("숫자가 아닙니다.")
        return
    }
    println(num)
}

fun main() {
    reader(BufferedReader(StringReader("not a number")))
}