package _07_smart_cast

import java.lang.IllegalArgumentException

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int {
    if (e is Num) {
        return e.value
    }

    if (e is Sum) {
        return eval(e.left) + eval(e.right)
    }
    throw IllegalArgumentException("오류 발생")
}

fun evalV2(e: Expr): Int =
    if (e is Num) {
        e.value
    } else if (e is Sum) {
        eval(e.left) + eval(e.right)
    } else {
        throw IllegalArgumentException("오류 발생")
    }

fun evalV3(e: Expr): Int =
    when (e) {
        is Num -> {
            e.value
        }

        is Sum -> {
            eval(e.left) + eval(e.right)
        }

        else -> {
            throw IllegalArgumentException("오류 발생")
        }
    }


fun main() {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(3))))
}