package videoCourse_04.kot.lessons.lesson414_singleton

fun main() {
    // Реализация Singleton, как в Java
    val db = Database.getInstance()
    db.insertData("1")
    db.insertData("2")

    val test = Test()
    test.insertTestData("3")
    test.insertTestData("4")

    for (str in db.data) {
        println(str)
    }

    // Реализация Singleton в Kotlin
    val dbObject = DatabaseObject
    dbObject.insertData("10")
    dbObject.insertData("20")

    val testObject = Test()
    testObject.insertTestDataObject("30")
    testObject.insertTestDataObject("40")

    for (str in dbObject.data) {
        println(str)
    }
}