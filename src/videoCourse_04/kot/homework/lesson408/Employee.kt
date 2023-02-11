package videoCourse_04.kot.homework.lesson408

open class Employee(val name: String, val age: Int) {
    open fun work() {
        println("$name, работаю")
    }
}