package _03_extension

/**
 * 확장 함수가 캡슐화를 깰 수 있을까??
 * protected private 함수를 호출하지 못함.
 */
class SampleClass {

    private fun privateFun() {
        println("private 메서드입니다.")
    }

    fun publicFun() {
        println("public 메서드입니다.")
    }
}

fun SampleClass.doSomething() = publicFun()
//fun SampleClass.doSomething2() = privateFun()
