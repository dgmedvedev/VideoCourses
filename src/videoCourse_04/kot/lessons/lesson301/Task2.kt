package videoCourse_04.kot.lessons.lesson301

fun main() {
    val perimeter: (Int, Int) -> Int = { a, b -> a + b }
    val printName: (String) -> Unit = { println("Привет, $it") }
    val sortArray: (Array<Int>) -> Array<Int> = {
        it.sortedArrayDescending()
        it
    }

    println(perimeter(10,5))
    printName("Name")

    val arr = sortArray(arrayOf(3,6,1))
    for(i in arr){
        println(i)
    }
}