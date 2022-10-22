package _05_string

fun main() {
    splitV1()
    splitV2()
}

private fun splitV1() {
    val splitByString = "split.by.point".split(".")
    val splitByRegex1 = "split.by.point".split(".".toRegex())
    val splitByRegex2 = "split.by.point".split("[.-]".toRegex())
    println(splitByString)
    println(splitByRegex1)
    println(splitByRegex2)
}

private fun splitV2() {
    val splitByString = "split.by-point".split(".", "-")
    val splitByRegex = "split.by.point".split("[.-]".toRegex())
    println(splitByString)
    println(splitByRegex)
}