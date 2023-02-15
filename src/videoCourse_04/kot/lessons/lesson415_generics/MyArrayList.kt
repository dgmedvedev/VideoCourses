package videoCourse_04.kot.lessons.lesson415_generics

class MyArrayList : MyList {

    private var capacity = 10
    private var array = Array(capacity) { "" }
    private var size = 0


    override fun get(index: Int): String = if (index in 0 until capacity) array[index] else "Incorrect index"

    override fun add(string: String) {
        if (size < capacity) {
            array[size] = string
        } else {
            capacity += 10
            val newArray = Array(capacity) { "" }
            for (i in array.indices) {
                newArray[i] = array[i]
            }
            array = newArray
            array[size] = string
        }
        size++
    }

    override fun remove(element: String) {
        TODO("Not yet implemented")
    }

    override fun removeAt(index: Int) {
        TODO("Not yet implemented")
    }

    override fun size(): Int = size
}