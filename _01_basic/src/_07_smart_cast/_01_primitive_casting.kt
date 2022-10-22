package _07_smart_cast

/**
 * 1. 기본형 타입 변환: 코틀린에서 타입 변환은 명시적으로 이루어져야 합니다.
 *   - JAVA에서는 오버플로를 예방하기 위해서 더 큰 타입으로 암시적 형변환이 일어남.
 *   변경을 하고 싶을때는 형변환 메서드를 사용해야 함. (T) 형식은 불가능
 */

private fun typeCasting1() {
    val intNum1: Int = 5
//    val number2: Long = intNum  ==> 불가능
    val longNum1: Long = intNum1.toLong()

    // 만약 Nullable한 경우에는 'safety Call'을 사용하자
    // safety call 은 null인 경우에 메서드를 실행하지 않는 기능이다.

    val nullableInt: Int? = 5
    val nullableLong: Long? = nullableInt?.toLong()
    val longNum2: Long = nullableInt?.toLong() ?: 0
}