package videoCourse_04.kot.lessons.lesson305

fun main() {
    // в Kotlin желательно использовать неизменяемые коллекции, т.е. data3,4.
    // Ниже приведены все возможные варианты создания коллекции Map
    val data1 = mutableMapOf<String, List<Int>>()
    data1.put("file1", listOf(15, 20, 45, 15, 12))
    data1.put("file2", listOf(34, 18, 50, 8, 31))
    data1.put("file3", listOf(76, 3, 51, 21, 44))
    val average1 = data1.flatMap { it.value }.average()
    val data2 = mutableMapOf<String, List<Int>>()
    data2["file1"] = listOf(15, 20, 45, 15, 12)
    data2["file2"] = listOf(34, 18, 50, 8, 31)
    data2["file3"] = listOf(76, 3, 51, 21, 44)
    val average2 = data2.flatMap { it.value }.average()
    val data3 = mapOf(
        "file1" to listOf(15, 20, 45, 15, 12),
        "file2" to listOf(34, 18, 50, 8, 31),
        "file3" to listOf(76, 3, 51, 21, 44)
    )
    val average3 = data3.flatMap { it.value }.average()
    val data4 = mapOf(
        Pair("file1", listOf(15, 20, 45, 15, 12)),
        Pair("file2", listOf(34, 18, 50, 8, 31)),
        Pair("file3", listOf(76, 3, 51, 21, 44))
    )
    val average4 = data4.flatMap { it.value }.average()
    println("A1 = $average1; A2 = $average2; A3 = $average3; A4 = $average4")
}