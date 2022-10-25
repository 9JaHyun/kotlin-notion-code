package _08_object_keyword

class Companion_userV1 {
    val nickname: String

    constructor(email: String) {
        nickname = email.substringBefore('@')
    }

    constructor(faceBookAccountId: Int) {
        nickname = faceBookAccountId.toString()
    }
}

class Companion_userV2 private constructor(nickname: String){
    companion object {
        fun newSubscribingUser(email: String) =
            Companion_userV2(email.substringBefore('@'))

        fun newFacebookUser(faceBookAccountId: Int) =
            faceBookAccountId.toString()
    }
}

fun main() {
    val newFacebookUser = Companion_userV2.newFacebookUser(214353)
    val subscribeUser = Companion_userV2.newSubscribingUser("kotlin@gmail.com")
}