package videoCourse_04.kot.homework.lesson403

fun main() {
    val worker = Worker("Jack", "Senior Android developer", 2020)
    worker.work()
    worker.printInfo()
}

fun Worker.printInfo() {
    println("Имя: $name, должность: $position, год устройства: $startYear, стаж: $experience")
}