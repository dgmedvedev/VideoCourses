package videoCourse_04.kot.homework.lesson10

fun main() {
    println(bubbleSort(mutableListOf(3, 2, -1, 6, 0, 5, 2)))
    println(bubbleSort(3, 2, -1, 6, 0, 5, 2))
    println(bubbleSort(arrayOf(3, 2, -1, 6, 0, 5, 2)))
}

fun bubbleSort(numbers: MutableList<Int>): List<Int> {
    val list = ArrayList<Int>()
    for (num in numbers) {
        list.add(num)
    }
    for (out in list.size - 1 downTo 1) {
        for (i in 0 until out) {
            if (list[i] > list[i + 1]) {
                val temp = list[i]
                list[i] = list[i + 1]
                list[i + 1] = temp
            }
        }
    }
    return list
}

fun bubbleSort(numbers: Array<Int>) = bubbleSort(numbers.toMutableList())
fun bubbleSort(vararg numbers: Int) = bubbleSort(numbers.toMutableList())