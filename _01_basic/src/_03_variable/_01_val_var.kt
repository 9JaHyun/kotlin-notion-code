fun main() {
    immutableArray()
}

// val, var 차이
fun valAndVar() {
    val number1: Int = 5
    var number2: Int = 5
    val number3: Int

//    number1 = 2 // 컴파일 에러
    number2 = 5
    number3 = 5 // 단 한번 설정 가능
//    number3 = 4 // 컴파일 에러
}

fun immutableArray() {
    val list = arrayListOf("hello")
    list.add("world")
    println(list)
}

fun noTypeChangeInVar() {
    var number = 5
//    number = "hello" // 컴파일 에러
}