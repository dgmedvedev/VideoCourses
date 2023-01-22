package videoCourse_04.kot.homework.lesson09

fun main() {
    val array = arrayOfNulls<Int?>(301)

    for ((index, i) in (300..600).withIndex()) {
        array[index] = i
    }

    // for (i in (array.size - 1) downTo 0 step 5) { println(array[i]) } - тот же результат
    for (i in (array.size - 1) downTo 0) {
        if (array[i]?.rem(5) == 0) {
            println(array[i])
        }
    }
}