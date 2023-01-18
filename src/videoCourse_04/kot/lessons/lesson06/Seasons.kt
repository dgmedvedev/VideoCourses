package videoCourse_04.kot.lessons.lesson06

fun main() {

    val season1 = when ("July") {
        "March", "April", "May" -> "spring"
        "June", "July", "August" -> "summer"
        "September", "October", "November" -> "autumn"
        "December", "January", "February" -> "winter"
        else -> "Не найдено!"
    }
    val season2 = when (3) {
        in 3..5 -> "spring"
        in 6..8 -> "summer"
        in 9..11 -> "autumn"
        12, 1, 2 -> "winter"
        else -> "Не найдено!"
    }

    println("Season1 = $season1")
    println("Season2 = $season2")
}