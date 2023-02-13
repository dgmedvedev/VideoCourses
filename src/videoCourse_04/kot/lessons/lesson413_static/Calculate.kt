package videoCourse_04.kot.lessons.lesson413_static

class Calculate {
    companion object {
        const val PI = 3.14
        fun square(num: Int) = num * num
        fun lengthOfCircle(radius: Double) = 2 * PI * radius
    }
}