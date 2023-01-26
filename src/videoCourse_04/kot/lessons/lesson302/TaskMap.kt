package videoCourse_04.kot.lessons.lesson302

fun main() {
    val numbers = (0..100).toList()
    val doubledNumbers = numbers.map { it * 2 }
    for (i in doubledNumbers) {
        println(i)
    }
    val employees = numbers.map { "Employee №$it" }
    for (i in employees) {
        println(i)
    }
}