package _08_object_keyword

class Person private constructor(
    var name: String,
    var age: Int
) {
    companion object {
        private const val MIN_AGE = 1

        @JvmStatic
        fun birth(name: String): Person {
            println("${name}이 태어났습니다. 나이 = $MIN_AGE")
            return Person(name, MIN_AGE)
        }
    }
}

fun main() {
    Person.birth("애기1")
}
