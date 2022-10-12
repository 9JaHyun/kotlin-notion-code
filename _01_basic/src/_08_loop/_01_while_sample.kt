package _08_loop

fun main() {
    whileSample1()
    doWhileSample1()
}

fun whileSample1() {
    var a = 5
    while (a > 5) {
        println("current a value is $a")
        a -= 1
    }
}

fun doWhileSample1() {
    var a = 5
    do {
        println("current a value is $a")
        a -= 1
    } while (a > 5)
}