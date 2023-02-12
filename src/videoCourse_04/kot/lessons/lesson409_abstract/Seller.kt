package videoCourse_04.kot.lessons.lesson409_abstract

class Seller(name: String, age: Int) : Employee(name, age), Cleaner {
    override fun work() {
        println("$name, продаю товар")
    }

    override fun clean() {
        println("$name, убирает")
    }
}