package _06_constructor._02_secondary_const

interface User {
    val name: String
}

class PrivateUser(override val name: String): User

class SubscribingUser(val email: String) : User {
    override val name: String
        get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int) : User {
    override val name: String = getFaceBookName(accountId)

    private fun getFaceBookName(accountId: Int): String = "이름 구하는 로직"
}

fun main() {
    val privateUser = PrivateUser("UserA")
    val subscribingUser = SubscribingUser("username@gmail.com")
    println(subscribingUser.name)
    println(subscribingUser.email)

}