package videoCourse_04.kot.lessons.lesson410_anonymous_classes

class Car(override var name: String = "Car") : Transport(name) {
    override fun drive() {
        println("$name is drive. This is car")
    }
}