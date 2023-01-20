package videoCourse_04.kot.lessons.lesson09

fun main() {
    val array = arrayOfNulls<Int?>(101)

    for (i in array.indices) {
        array[i] = i
    }

    for (i in array) {
        println("$i indices")
    }

    for (i in 10..120) { // включая 10 и 120
        println(i)
    }

    for (i in 10 until 120) { // включая 10, не не включая 120
        println(i)
    }

    for (i in 90 downTo 10 step 2) {  // включая 90 и 10, с шагом 2
        println(i)
    }

    for ((index, i) in array.withIndex()) { // в отличие от Java, изменяем массив в цикле foreach
        array[index] = i?.times(2)
    }

    for (i in array) {
        println(i)
    }
}