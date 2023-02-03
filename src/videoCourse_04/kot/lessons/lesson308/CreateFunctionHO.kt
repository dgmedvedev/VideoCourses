package videoCourse_04.kot.lessons.lesson308

fun main() {
    val result = modifyString("Hello world!") { it.toUpperCase() }
    println(result)
}

fun modifyString(string: String, modify: (String) -> String): String {
    return modify(string)
}