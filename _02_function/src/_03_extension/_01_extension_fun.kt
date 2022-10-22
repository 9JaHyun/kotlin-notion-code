package _03_extension

/**
 * 자연스럽게 기존 코드에서 확장을 하는 것이 코틀린의 기조 중 하나.
 * 클래스에 간단한 함수 선언만으로 추가가 가능
 *
 * 방법
 * 추가를 하기 위해서는 함수 이름 앞에 그 함수가 확장할 클래스 이름만 붙여주면 된다!
 *  - 이때 클래스 이름을 수신 객체 타입이라고 한다.
 *  - 확장 함수가 호출되는 대상이 되는 값을 수신 객체라고 한다.
 */

/**
 * @description
 *  - 가장 마지막 문자를 반환하는 메서드
 *  - 이떄 this는 함수 선언에서 타입을 의미함 (여기서는 String)
 *  - 수신 객체 타입 : String
 *  - 수신 객체 : this
 */

fun String.lastChar(): Char = this.get(this.length -1)

// 사실 this를 사용하지 않아도 됩니다.
fun String.lastChar2(): Char = get(length -1)


fun main() {
    println("hello".lastChar())
}