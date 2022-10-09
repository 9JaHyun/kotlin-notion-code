package _04_class

class User(
    val name: String,
    var age: Int
) {

    val isChild: Boolean
        get() {
            return age < 20
        }
}