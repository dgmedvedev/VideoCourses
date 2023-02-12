package videoCourse_04.kot.lessons.lesson410_anonymous_classes

fun main() {
    val car: Transport = Car()
    val bicycle: Transport = Bicycle()
    // if(car !is Car) return - после такой проверки, нижезаписанный код выполняться не будет, в случае false
    if (car is Car) {
        car.name = "Car2"
    }
    println(car.name)
    println(bicycle.name)

    // Анономные классы - чтобы не создавать класс, для выполнения какого-либо разового действия
    // travel(new Car()) - синтаксис Java
    travel(object : Transport("Bus") {
        override fun drive() {
            println("$name is drive")
        }
    })

}

fun travel(transport: Transport) {
    transport.drive()
}