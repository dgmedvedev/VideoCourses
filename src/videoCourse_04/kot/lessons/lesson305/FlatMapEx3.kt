package videoCourse_04.kot.lessons.lesson305

fun main() {
    val data1 = mapOf(
        "file1" to listOf(15, -20, 45, 15, 12),
        "file2" to listOf(34, 18, 50, 8, 31),
        "file3" to listOf(76, 3, 51, 21, 44)
    )
    // проверяем, все ли элементы имеют положительное значение и находим среднее арифметическое
    // в данном примере, file1 не будет учитываться при расчете, т.к. одно из значений отрицательное
    // all вернет true, если все элементы вернут true
    val average1 = data1.filter { it -> it.value.all { it >= 0 } }.flatMap { it.value }.average()
    println(average1)

    val data2 = mapOf(
        "file1" to listOf(15, -20, 45, 15, 12),
        "file2" to listOf(34, 18, 50, 8, 31),
        "file3" to listOf(76, 3, 51, 21, 44)
    )
    // filterNot оставляет те элементы, которые возвращают false при фильтрации
    // any вернет true, если хотя бы 1 из элементов вернет true
    val average2 = data2.filterNot { it -> it.value.any { it < 0 } }.flatMap { it.value }.average()
    println(average2)
}