package _05_enum

enum class Color(
    val r: Int,
    val g: Int,
    val b: Int
) {
    BLACK(0, 0, 0),
    RED(255, 0, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    WHITE(255, 255, 255)
}