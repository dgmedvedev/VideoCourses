package videoCourse_04.kot.homework.lesson401

class Dog {
    var nickname: String = ""
        get() = field.toLowerCase().capitalize()
    var age: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
    var weight: Double = 0.0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
}