package videoCourse_04.kot.lessons.lesson303

// generateSequence генерирует бесконечную последовательность данных,
// но данные выводятся, только если к ним обратиться
fun main() {
    val array1 = generateSequence('A') {
        println("Сгенерировано: ${it + 1}")
        it + 1
    }

    val charList = array1.take(10)
    for (ch in charList) {
        println(ch)
    }

    val array2 = generateSequence {
        (Math.random() * 100).toInt()
    }

    val randomList = array2.take(10)
    for (r in randomList) {
        println(r)
    }
}