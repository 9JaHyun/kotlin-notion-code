package _02_inheritate

private abstract class AbstractClass {

    fun method1() {

    }

    abstract fun method2()

    open fun method3() {

    }
}

private class ClassA : AbstractClass() {

    override fun method2() {
        println("abstract 키워드가 붙으면 override 필수")
    }

    override fun method3() {
        println("똑같이 open 키워드가 붙어야 override 가능")
    }
}

fun main() {
//    val abstractClass = AbstractClass()
    val classA = ClassA()
}