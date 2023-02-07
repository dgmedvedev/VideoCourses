package videoCourse_04.kot.lessons.lesson403

fun main() {
    val cat = Cat("Barsik", 5, 3f)
    println(cat.toString())
    println(cat.isOld())
}

fun Cat.isOld() = age >= 12