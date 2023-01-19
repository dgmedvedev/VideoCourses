package videoCourse_04.kot.homework.lesson06

fun main() {
    val time = 10
    val weatherIsGood = true
    val action = when {
        time in 6..22 && weatherIsGood -> "гулять"
        time in 6..22 && !weatherIsGood -> "читать"
        else -> "спать"
    }
    println(action)
}