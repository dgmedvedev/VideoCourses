package videoCourse_04.kot.lessons.lesson414_singleton

// Реализация Singleton, как в Java
class Database private constructor() {
    val name = "main.db"
    val data = mutableListOf<String>()
    fun insertData(str: String) {
        data.add(str)
    }

    companion object {
        private var db: Database? = null
        fun getInstance(): Database {
            db?.let {
                return it
            }
            val instance = Database()
            db = instance
            return instance
        }
    }
}