package _05_sealed_class

import java.lang.IllegalArgumentException

sealed class Expr3
class Num2(val value: Int) : Expr3()
class Sum2(val left: Expr3, val right: Expr3) : Expr3()
class Div2(val left: Expr3, val right: Expr3) : Expr3()

fun eval(e: Expr3): Int =
    when (e) {
        is Num2 -> e.value
        is Sum2 -> eval(e.left) + eval(e.right)
        is Div2 -> eval(e.left) / eval(e.right)
    }