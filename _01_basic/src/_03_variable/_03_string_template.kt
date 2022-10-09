/**
 *  동적인 문자열을 조금 더 쉽게 만들어주기 위해 문자열 템플릿을 제공함
 */

fun main() {
    string_template("world")
    string_template("kotlin")
    string_template2(arrayOf("world", "kotlin"))
    string_template3(arrayOf())
    string_template3(arrayOf("world"))
}

fun string_template(name: String) {
    println("hello $name")
//    println("hello $nickname")
}

fun string_template2(name: Array<String>) {
    println("hello ${name[0]}")
    println("goodBye ${name[1]}")
}

fun string_template3(name: Array<String>) {
    println("hello ${if (name.isNotEmpty()) name[0] else "everyone"}")
}