package videoCourse_04.kot.lessons.lesson07

fun main() {
    //1-ое правило чистой архитектуры (Clean Architecture):
    //везде, где возможно, использовать абстракцию вместо реализации (например MutableList, а не ArrayList)
    val listOfNumbers:MutableList<Int> = ArrayList()
    listOfNumbers.add(5)
    println(listOfNumbers[0])
}