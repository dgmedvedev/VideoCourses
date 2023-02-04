package videoCourse_04.kot.lessons.lesson12

import java.util.*

fun main() {
    var sc = Scanner(System.`in`)
    val s1 = sc.nextLine()
    sc = Scanner(System.`in`)
    val s2 = sc.nextLine()

    println(sum(s1, s2))
}

fun sum(a: String, b: String): Int {
    return try {
        val numA = a.toInt()
        val numB = b.toInt()
        numA + numB
    } catch (e: Exception) {
        0
    }
}