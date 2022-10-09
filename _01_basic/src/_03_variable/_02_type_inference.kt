fun main() {
    typeInference()
}

// 타입 추론
fun typeInference() {
    val int = 5
    val string = "Hello"
    val double = 5.22

    println(int.javaClass.name)
    println(string.javaClass.name)
    println(double.javaClass.name)
}

fun typeInference_Bad_Case() {
//    val int // 아무 값을 입력하지 않는 경우
    val int2: Int
//    print(int)  // 타입추론은 했으나 값이 없어서 컴파일 오류
}
