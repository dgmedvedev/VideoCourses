package videoCourse_04.kot.lessons.lesson415_generics

class MyArrayList<T> : MyList<T> {

    private var capacity = 10
    private var array = arrayOfNulls<Any>(capacity)
    private var size = 0

    companion object {
        fun <T> myListOf(vararg elements: T): MyArrayList<T> {
            val list = MyArrayList<T>()
            for (element in elements) {
                list.add(element)
            }
            return list
        }
    }

    override fun get(index: Int): T {
        if (index in 0 until size) {
            array[index]?.let {
                return it as T
            }
        }
        throw IndexOutOfBoundsException()
    }

    override fun add(string: T) {
        if (size >= capacity) {
            capacity = (capacity * 1.5).toInt() + 1
            array = array.copyOf(capacity)
        }
        array[size] = string
        size++
    }

    override fun remove(element: T) {
        for ((index, string) in array.withIndex()) {
            if (string == element) {
                removeAt(index)
                return
            }
        }
    }

    override fun removeAt(index: Int) {
        if (index in 0 until size) {
            size--

            if (index == size) {
                array[index] = null
            } else {
                for (i in index until size) {
                    if (i + 1 == size) {
                        array[i] = array[i + 1]
                        array[i + 1] = null
                        break
                    } else {
                        array[i] = array[i + 1]
                    }
                }
            }
        } else {
            throw ArrayIndexOutOfBoundsException()
        }
    }

    override fun size(): Int = size
}