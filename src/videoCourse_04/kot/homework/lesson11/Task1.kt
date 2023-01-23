package videoCourse_04.kot.homework.lesson11

fun main() {
    println(volume())
    println(volume(8.5))
    println(volume(3.0, 2.0))
    println(volume(c = 10.0, a = 5.0, b = 3.0))

    println(volume(3))
    println(volume(5, 2))
}

fun volume(a: Double = 0.0, b: Double = 0.0, c: Double = 0.0): Double =
    when {
        b == 0.0 && c == 0.0 -> a * a * a
        a == 0.0 && c == 0.0 -> b * b * b
        a == 0.0 && b == 0.0 -> c * c * c
        a == 0.0 -> b * c * b
        b == 0.0 -> a * c * a
        c == 0.0 -> a * b * a
        else -> a * b * c
    }

fun volume(a: Int, b: Int = a, c: Int = a) = a * b * c