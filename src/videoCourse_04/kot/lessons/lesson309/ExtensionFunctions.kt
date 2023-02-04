package videoCourse_04.kot.lessons.lesson309

fun main() {
    val age = 6
    println(age.isPositive())
    println(age.isPrime())
}

fun Int.isPositive() = this >= 0

fun Int.isPrime(): Boolean {
    if (this == 1) {
        return false
    }
    if (this == 2 || this == 3) {
        return true
    }
    for (i in 2 until this) {
        if (this % i == 0) {
            return false
        }
    }
    return true
}