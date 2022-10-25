package _01_interface

/**
 *
 */
interface Clickable {
    fun click() {
        println("click")
    }

    fun introduce() = println("저는 Clickable입니다.")
}