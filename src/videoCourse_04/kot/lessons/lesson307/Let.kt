package videoCourse_04.kot.lessons.lesson307

var name: String? = "null__"

fun main() {
//    if (name?.length?.compareTo(5) == 1) {
//        println("Hello")
//    }

    // let заменяет вышенаписанный текст.
    // Применяется с нулабельными переменными, для читабельности кода
    name?.let {
        if (it.length > 5) {
            println("Hello")
        }
    }
}