package videoCourse_04.kot.lessons.lesson308

fun main() {
    val list = listOf(2, 4, 6, 8, 10, 25, 13)
    printCollection(list) { it.sum() }
}

inline fun printCollection(list: List<Int>, operator: (List<Int>) -> Int) {
    println(operator(list))
}