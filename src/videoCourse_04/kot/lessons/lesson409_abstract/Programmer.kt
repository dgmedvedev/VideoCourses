package videoCourse_04.kot.lessons.lesson409_abstract

class Programmer(name: String, age: Int, private var languageProgramming: String) : Employee(name, age), Cleaner {
    override fun work() {
        println("$name, пишу код на $languageProgramming")
    }

    override fun clean() {
        println("$name, убирает")
    }
}