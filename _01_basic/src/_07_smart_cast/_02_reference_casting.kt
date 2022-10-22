package _07_smart_cast

/**
 *  2. 참조형 타입 변환
 *    - is: instanceOf와 같음.
 *    - !is: is의 역
 *    - as: (T) 과 같음.
 */

private fun isIntNumberV1(obj: Any){
    if (obj is IntNumber) { // instanceOf
        val num = obj as IntNumber
        println("IntNumber 타입이 맞습니다! 값 = ${num.value}")
    }
    if (obj !is IntNumber) { // !(instanceOf)
        println("IntNumber 타입이 아닙니다.")
    }
}

// 사실 is로 체크를 했다면 타입 변환을 알아서 해준다.
private fun isIntNumberV2(obj: Any){
    if (obj is IntNumber) {
        println("IntNumber 타입이 맞습니다! 값 = ${obj.value}")
    }
    if (obj !is IntNumber) {
        println("IntNumber 타입이 아닙니다.")
    }
}

// NullChecking
// casting 시 as?를 붙여주면 안전한 캐스팅이 가능하다. (null이면 그냥 null 반환)
private fun isIntNumberV3(obj: Any?){
    if (obj is IntNumber) {
        val num = obj as? IntNumber
        // 그리고 Null 이 올 수 있기 때문에 safety call을 사용하자.
        println("IntNumber 타입이 맞습니다! 값 = ${num?.value}")
    }
    if (obj !is IntNumber) {
        println("IntNumber 타입이 아닙니다.")
    }
}


class IntNumber(
    val value: Int
) {

}