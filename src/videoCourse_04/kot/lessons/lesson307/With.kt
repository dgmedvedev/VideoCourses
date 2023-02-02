package videoCourse_04.kot.lessons.lesson307

fun main() {
    val list = mutableListOf<Int>()

//    for (i in 0 until 1000) {
//        list.add((Math.random() * 100).toInt())
//    }
//    println(list.sum())
//    println(list.average())
//    println(list.max())
//    println(list.min())

    // with() применяется в тех случаях, когда необходимо произвести множество операций с одним объектом
    with(list) {
        for (i in 0 until 1000) {
            this.add((Math.random() * 100).toInt()) // this указывать необязательно, см.ниже
        }
        println(sum())
        println(average())
        println(max())
        println(min())
        println(first())
        println(last())
    }
}