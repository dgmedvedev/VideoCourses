package videoCourse_04.kot.lessons.lesson410_anonymous_classes

class Bicycle(name: String = "Bicycle") : Transport(name) {
    override fun drive() {
        println("$name is drive. This is bicycle")
    }
}