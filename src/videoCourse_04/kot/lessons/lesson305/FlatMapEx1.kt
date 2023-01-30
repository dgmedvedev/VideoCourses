package videoCourse_04.kot.lessons.lesson305

fun main() {
    val revenueByWeek = listOf(
        listOf(1, 2, 4, 6, 5),
        listOf(3, 2, 5, 6, 2),
        listOf(4, 3, 4, 2, 6),
        listOf(7, 5, 6, 3, 5)
    )

    // val total = revenueByWeek.flatMap { it }
    val total = revenueByWeek.flatten() // - тот же результат, что и строка выше.
    val average = total.average()
    println(average)
}