package _09_Exception

import java.lang.IllegalArgumentException

private fun isUnderTen(num: Int) {
    if (num > 10) {
        throw IllegalArgumentException("10을 넘습니다.")
    }
}

private fun tryCatchFinally() {
    try {
//
    }
    catch (e: IllegalArgumentException) {
        println(e.message)
    }
    finally {
        //...
    }
}