package videoCourse_04.kot.lessons.lesson414_singleton

class Test {
    fun insertTestData(str: String) {
        Database.getInstance().insertData(str)
    }

    fun insertTestDataObject(str: String) {
        DatabaseObject.insertData(str)
    }
}