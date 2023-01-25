package videoCourse_04.kot.lessons.lesson301

fun main() {
    //Задача 1
    val perimeter: (Int, Int) -> Int = { a, b -> (a + b) * 2 }
    println(perimeter(10, 5))
    //Задача 2
    val printName: (String) -> Unit = { println("Привет, $it") }
    printName("Name")
    //Задача 3
    val sortArray: (Array<Int>) -> Array<Int> = {
        for (i in it.size - 1 downTo 1) {
            for (j in 0 until i) {
                if (it[i] > it[j]) {
                    val temp = it[i]
                    it[i] = it[j]
                    it[j] = temp
                }
            }
        }
        it
    }
    val arr = sortArray(arrayOf(3, 6, 1, 0, 3, 23))
    println(arr.contentToString()) // println(Arrays.toString(arr))
    for (i in arr) {
        println(i)
    }
}