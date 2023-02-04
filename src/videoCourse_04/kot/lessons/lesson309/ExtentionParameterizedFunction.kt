package videoCourse_04.kot.lessons.lesson309

fun main() {
    val obj = mutableMapOf<String, String>()
    myWith(obj) {
        keys
        values
    }

    myWithR(obj) {
        keys
    }
}

inline fun <T> myWith(obj: T, operation: T.() -> Unit) {
    obj.operation()
}

inline fun <T, R> myWithR(obj: T, operation: T.() -> R): R {
    return obj.operation()
}