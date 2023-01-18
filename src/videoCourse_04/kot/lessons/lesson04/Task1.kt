package videoCourse_04.kot.lessons.lesson04

var count = 1000

// if - else (в Kotlin может возвращать значение)
fun main() {
    val food = buyFood(300)
    var test = test(300)
    println("Вы можете позволить купить себе $food")
    println("count = $count")
    println("test: $test")
    println()

    test = test(100)
    println("Вы можете позволить купить себе ${buyFood(100)}") // в {} указывается метод
    println("count = $count")
    println("test: $test")
}

fun buyFood(money: Int): String {
    return if (money > 500) {
        count -= money
        "пиццу" // последняя запись обязательно должна быть присваиваемым значением
    } else if (money > 200) {
        count -= money
        "шаурму"
    } else {
        count -= money
        "доширак"
    }
}

fun test(i: Int): Any? { // тип возвращаемого значения в Kotlin может быть разным. (Any - это как Object в Java)
    return if (i > 500) {
        "String"
    } else if (i > 200) {
        333
    } else {
        null
    }
}