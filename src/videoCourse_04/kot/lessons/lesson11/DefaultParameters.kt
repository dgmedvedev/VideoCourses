package videoCourse_04.kot.lessons.lesson11

fun main() {
    printInfo(patronymic = "Иванович")
}

fun printInfo(lastName: String = "", name: String = "", patronymic: String = "") {
    if (lastName.isNotEmpty()) {
        println("Фамилия: $lastName")
    }

    if (name.isNotEmpty()) {
        println("Имя: $name")
    }

    if (patronymic.isNotEmpty()) {
        println("Отчество: $patronymic")
    }
}