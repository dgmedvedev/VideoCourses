package videoCourse_04.kot

fun main() {
    var str = "Hello World! "
    val i: Int
    val j = 5
    val k = 10
    i = j + k
    println(str + i)

    val ch = 'H'
    str = " e l l o World! "
    val prepended = "$ch$str"
    println(prepended)

    val array1 = intArrayOf(1, 2, 3)
    val array2 = IntArray(10)

    for (el in array1) {
        println(el)
    }

    for (el in array2) {
        println(el)
    }
}