package videoCourse_04.kot.homework.lesson408

class Programmer(name: String, age: Int, private var languageProgramming: String) : Employee(name, age) {
    override fun work() {
        println("$name, пишу код на $languageProgramming")
    }
}