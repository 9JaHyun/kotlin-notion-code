/* 함수 */
fun add(a: Int, b: Int): Int {
    return a + b
}

// 블록 생략 가능.
fun addV2(a: Int, b: Int): Int = a + b

// 타입 추론 기능
fun addV3(a: Int, b: Int) = a + b
