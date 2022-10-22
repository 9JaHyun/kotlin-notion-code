fun <T> joinToString(
    collection: Collection<T>,
    separator: String,
    prefix: String,
    postfix: String
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if(index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun <T> joinToStringV2(
    collection: Collection<T>,
    separator: String = ",",
    prefix: String = "[",
    postfix: String = "]"
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if(index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun main() {
    println(joinToString(listOf("hello", "kotlin"), ",", "[", "]"))
    println(joinToString(collection = listOf("hello", "kotlin"),
        separator = ",",
        prefix = "[",
        postfix = "]"))
}