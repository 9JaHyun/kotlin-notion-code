package _03_Access_Modifier

private val PRIVATE_FIELD = 5

private class PrivateClass {

}

private open class HelloClass {
    fun sayHello() {
        println("안녕하세요!")
    }

    protected fun sayGoodBye() {
        println("안녕히가세요")
    }

}

//fun HelloClass.say1() { }

// 하위 클래스에서는 사용 가능.
private class HelloClass2 : HelloClass() {
    fun doSomething() {
        sayGoodBye()
    }
}

private fun HelloClass.say2() {
    sayHello()
//    sayGoodBye()
}

fun main() {
    val pc = PrivateClass()
    val privateField = PRIVATE_FIELD
}