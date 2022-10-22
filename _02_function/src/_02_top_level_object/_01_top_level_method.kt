package _02_top_level_object

/**
 * 자바에서는 항상 메서드가 클래스 하위에 존재해야 합니다.
 * 하지만 코틀린에서는 그럴필요 없이 최상위 메서드 구현이 가능합니다.
 */

fun topLevelFun() {
    println("최상위 함수 구현!")
}


@JvmName("changeFunName2")
fun changeFunName() {
    println("이름이 변경되었나요?")
}
