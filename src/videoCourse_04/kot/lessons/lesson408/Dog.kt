package videoCourse_04.kot.lessons.lesson408

class Dog(weight: Float) : Animal("Собака", weight, "Суша") {
    override fun eat() {
        println("Dog eat")
    }
}