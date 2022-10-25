package _05_sealed_class

import java.lang.IllegalArgumentException

private interface Expr

private class Num(val value: Int) : Expr
private class Sum(val left: Expr, val right: Expr) : Expr

private fun eval(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval(e.right) + eval(e.left)
        else -> throw IllegalArgumentException("Unknown Expression")
    }
