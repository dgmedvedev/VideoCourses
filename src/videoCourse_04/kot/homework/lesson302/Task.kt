package videoCourse_04.kot.homework.lesson302

fun main() {
    val list = ArrayList<Int>()
    for (i in 0 until 1000) {
        val random = (Math.random() * 1000).toInt()
        list.add(random)
    }
    val filterList = list.filter { it % 5 == 0 || it % 3 == 0 }.map { it * it }.sortedDescending().map { "$it" }
    for (i in filterList) {
        println(i)
    }
}