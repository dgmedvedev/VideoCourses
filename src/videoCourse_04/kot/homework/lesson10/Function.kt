package videoCourse_04.kot.homework.lesson10

fun main() {
    println(sort(3, 5, 1, 3, 0, 3, 1, 7, 9, 5, 7, 10))
}

fun sort(vararg numbers: Int): List<Int> {
    val list = ArrayList<Int>()
    for (num in numbers) {
        list.add(num)
    }
    list.sort()
    return list
}