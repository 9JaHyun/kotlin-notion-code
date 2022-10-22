package _03_extension

fun <T> Collection<T>.joinToString(
    separator: String = ",",
    prefix: String = "[",
    postfix: String = "]"
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in withIndex()) {
        if(index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

// 만약 수신객체가 특정 타입에서만 적용 가능하게 하고 싶다면?
fun Collection<String>.join(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
) = joinToString(separator, prefix, postfix)

fun main() {
    println(listOf(1, 2, 3).joinToString())
    println(listOf("1", "2", "3").join())
//    println(listOf(1, 2, 3).join())
}