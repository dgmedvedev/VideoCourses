package videoCourse_04.kot.lessons.lesson415_generics

fun main() {
    val list = MyArrayList.myListOf("2", "4", "hi")

    for (i in 0..100) {
        list.add("$i")
    }

    for (i in 0..90) {
        list.removeAt(0)
    }

    for (i in 0 until list.size()) {
        println(list.get(i))
    }
}