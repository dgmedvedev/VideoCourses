package videoCourse_04.kot.lessons.lesson415_generics

class AndreyArrayList : MyList {

    private var capacity = 10
    private var array = arrayOfNulls<String>(capacity)
    private var size = 0

    override fun get(index: Int): String {
        if (index in 0 until size) {
            array[index]?.let {
                return it
            }
        }
        throw IndexOutOfBoundsException()
    }

    override fun add(string: String) {
        if (size < capacity) {
            array[size] = string
        } else {
            capacity = capacity * 2 + 1
            array = array.copyOf(capacity)
            array[size] = string
        }
        size++
    }

    override fun remove(element: String) {
        for (i in array.indices) {
            if (array[i] == element) {
                size--
                if (i == size) {
                    array[i] = ""
                    break
                }
                for (j in i until size) {
                    if (j + 1 == size) {
                        array[j] = array[j + 1]
                        array[j + 1] = ""
                        break
                    } else {
                        array[j] = array[j + 1]
                    }
                }
            }
        }
    }

    override fun removeAt(index: Int) {
        if (index in 0 until size) {
            size--

            if (index == size) {
                array[index] = ""
            } else {
                for (i in index until size) {
                    if (i + 1 == size) {
                        array[i] = array[i + 1]
                        array[i + 1] = ""
                        break
                    } else {
                        array[i] = array[i + 1]
                    }
                }
            }
        }
        throw ArrayIndexOutOfBoundsException()
    }

    override fun size(): Int = size
}