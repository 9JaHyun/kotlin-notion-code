package _03_extension

/**
 * 확장함수는 하위 클래스에서 오버라이드가 불가능합니다.
 */

open class Printer {
    open fun turnOn() = println("Printer 전원 켜짐!")
}

class PrettyPrinter : Printer() {
    override fun turnOn() = println("Pretty Printer 전원 켜짐!")
}

fun main() {
    val printer: Printer = PrettyPrinter()
    printer.turnOn()
    printer.turnOff()
}

fun Printer.turnOff() = println("Printer 전원 꺼짐!")
fun PrettyPrinter.turnOff() = println("Printer 전원 꺼짐!")