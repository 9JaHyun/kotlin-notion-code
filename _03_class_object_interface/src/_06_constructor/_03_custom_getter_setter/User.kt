package _06_constructor._03_custom_getter_setter

class User(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println("""
                Address was changes for $name:
                "$field" -> "$value"
            """.trimIndent())
            field = value
        }
    var phoneNumber: String = "010-0000-0000"
        private set
}

fun main() {
    val user = User("홍길동")
    user.address = "분당구"
    user.address = "삼성동"

    // 컴파일 에러
//    user.phoneNumber = "010-1234-5678"
    println(user.phoneNumber)

}