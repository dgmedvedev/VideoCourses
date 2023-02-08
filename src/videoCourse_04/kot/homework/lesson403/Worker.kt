package videoCourse_04.kot.homework.lesson403

import java.time.LocalDate

class Worker(val name: String, val position: String, val startYear: Int) {

    val experience: Int
        get() = LocalDate.now().year - startYear

    fun work() {
        println("Работаю...")
    }
}