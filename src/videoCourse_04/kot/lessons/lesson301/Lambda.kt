package videoCourse_04.kot.lessons.lesson301

fun main() {
    val sum: (Int, Int) -> Int = { a, b -> a + b }
    val square1 = { a: Int -> a * a }
    val square2: (Int) -> Int = { it * it } // только, если 1 параметр

    println(sum(10, 5))
    println(square1(10))
    println(square2(20))
}