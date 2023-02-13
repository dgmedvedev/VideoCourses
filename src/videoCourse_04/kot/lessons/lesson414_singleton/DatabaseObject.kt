package videoCourse_04.kot.lessons.lesson414_singleton

// Реализация Singleton в Kotlin
// (просто создается объект, синхронизация по умолчанию реализована)
object DatabaseObject {
    val name = "main.db"
    val data = mutableListOf<String>()
    fun insertData(str: String) {
        data.add(str)
    }
}