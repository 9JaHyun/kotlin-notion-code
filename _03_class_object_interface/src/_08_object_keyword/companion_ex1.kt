package _08_object_keyword

fun topLevelFun() {
    val clazzA = A("foo")
//    clazzA.foo   <== 접근 불가

    B.bar()
}

class A(
    private val foo: String,
){

}

class B(
    private val foo: String,
){
    companion object {
        fun bar() {
            println("Companion object Called")
        }
    }
}