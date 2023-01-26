package videoCourse_04.kot.homework.lesson303

fun main() {
    var num = 0

    val array: Sequence<String> = generateSequence {
        num++
        "Сотрудник №$num"
    }

    val first100 = array.take(100)
    for (i in first100) {
        println(i)
    }
}