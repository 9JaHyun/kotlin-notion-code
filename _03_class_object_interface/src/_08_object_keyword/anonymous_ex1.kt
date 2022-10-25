package _08_object_keyword

// 익명 클래스는 [object : 타입] 을  사용한다.
// 자바에서는 new Action() 이었다!
fun main() {
    doSomething(object : Action {
        override fun start() {
            println("빠르게 걷기")
        }

        override fun stop() {
            println("정지!")
        }
    })

    val action = object : Action {
        override fun start() {
            println("빠르게 걷기")
        }

        override fun stop() {
            println("정지!")
        }
    }
    doSomething(action)
}

private fun doSomething(action: Action) {
    action.start()
    action.stop()
}

interface Action {
    fun start()
    fun stop()
}