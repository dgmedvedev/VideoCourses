package videoCourse_04.kot.lessons.lesson10

import kotlin.math.min

fun main() {
    println(max(5, 10))
    println(crop("Hello-World"))
    println(sum(5, 10, 15, 20, 25))
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun crop(str: String) = str.substring(0, min(5, str.length))

fun sum(vararg numbers: Int): Int {
    var result = 0
    for (num in numbers) {
        result += num
    }
    return result
}