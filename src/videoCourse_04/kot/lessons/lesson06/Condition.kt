package videoCourse_04.kot.lessons.lesson06

fun main() {
    val temp = 50

    val condition1 = if (temp < 0) {
        "твердое"
    } else if (temp > 99) {
        "газообразное"
    } else "жидкое"

    val condition2 = when {
        temp < 0 -> "твердое"
        temp > 99 -> "газообразное"
        else -> "жидкое"
    }
    println(condition1)
    println(condition2)
}