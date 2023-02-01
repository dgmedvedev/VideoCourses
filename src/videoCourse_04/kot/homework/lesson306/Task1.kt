package videoCourse_04.kot.homework.lesson306

fun main() {
    val data = mapOf(
        "Январь" to listOf(100, 100, 100, 100),
        "Февраль" to listOf(200, 200, -190, 200),
        "Март" to listOf(300, 180, 300, 100),
        "Апрель" to listOf(250, -250, 100, 300),
        "Май" to listOf(200, 100, 400, 300),
        "Июнь" to listOf(200, 100, 300, 300)
    )
    printInto(data)
}

fun printInto(data: Map<String, List<Int>>) {
    val correctMonthsMap = data.filter { it -> it.value.all { it >= 0 } }
    val avgRevenueInWeek = correctMonthsMap.flatMap { it.value }.average()

    val revenueInCorrectMonths = correctMonthsMap.map { it.value.sum() }
    val maxRevenueInMonths = revenueInCorrectMonths.max()
    val minRevenueInMonths = revenueInCorrectMonths.min()
    val avgRevenueInAllMonths = revenueInCorrectMonths.average()

    val incorrectMonthsMap = data.filter { it -> it.value.any { it < 0 } }
    val namesInCorrectMonths = correctMonthsMap.map { it.key }
    val namesInIncorrectMonths = incorrectMonthsMap.keys

    var monthWithMaxRevenue = ""
    var monthWithMinRevenue = ""
    var errorInMonths = ""

    for (i in revenueInCorrectMonths.indices) {
        if (revenueInCorrectMonths[i] == maxRevenueInMonths) {
            monthWithMaxRevenue += "${namesInCorrectMonths[i]} "
        }
        if (revenueInCorrectMonths[i] == minRevenueInMonths) {
            monthWithMinRevenue += "${namesInCorrectMonths[i]} "
        }
    }

    for (month in namesInIncorrectMonths) {
        errorInMonths += "$month "
    }

    println(
        """
Средняя выручка в неделю: $avgRevenueInWeek
Средняя выручка в месяц: $avgRevenueInAllMonths
Максимальная выручка в месяц: $maxRevenueInMonths
Была в следующих месяцах: $monthWithMaxRevenue
Минимальная выручка в месяц: $minRevenueInMonths
Была в следующих месяцах: $monthWithMinRevenue
Ошибки произошли в следующих месяцах: $errorInMonths
        """
    )
}