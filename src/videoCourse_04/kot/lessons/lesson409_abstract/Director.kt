package videoCourse_04.kot.lessons.lesson409_abstract

class Director(name: String, age: Int) : Employee(name, age) {
    override fun work() {
        println("$name, управляю процессом")
    }
}