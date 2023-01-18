package videoCourse_04.kot.homework.lesson03
// Nullable types (нулабельные типы)

private val str1: String? = "null"
private val str1Length: Int = str1?.length ?: 0
private val str2: String? = null
private val str2Length: Int = str2?.length ?: 0
private val str3: String? = null
private val str3Length: Int = str3?.length ?: 0


fun main() {
    val stringsLength: Int = str1Length + str2Length + str3Length
    println(stringsLength)
}