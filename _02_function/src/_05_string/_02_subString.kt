package _05_string

fun main() {

    val path = "/study/book/kotlinInAction.pdf"
    subStringPathV1(path)
}

private fun subStringPathV1(path: String) {

    val dir = path.substringBeforeLast("/")
    val fileName = path.substringAfterLast("/")
    val fullPath = path.substringBeforeLast(".")
    val extension = path.substringAfterLast(".")

    println(dir)
    println(fileName)
    println(fullPath)
    println(extension)
}