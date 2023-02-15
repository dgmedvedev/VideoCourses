package videoCourse_04.kot.lessons.lesson415_generics

fun main() {
    val myArrayList = MyArrayList()
    myArrayList.add("10")
    myArrayList.add("20")
    myArrayList.add("30")
    myArrayList.add("40")
    myArrayList.add("50")
    myArrayList.add("60")
    myArrayList.add("70")
    myArrayList.add("80")
    myArrayList.add("90")
    myArrayList.add("100")
    myArrayList.add("110")
    myArrayList.add("120")

    for (i in 0 until myArrayList.size()) {
        println(myArrayList.get(i))
    }

    myArrayList.remove("20")
    myArrayList.remove("40")
    myArrayList.remove("60")
    myArrayList.remove("80")
    myArrayList.remove("100")
    myArrayList.remove("120")

    println()
    for (i in 0 until myArrayList.size()) {
        println(myArrayList.get(i))
    }

    myArrayList.add("10")
    println()
    for (i in 0 until myArrayList.size()) {
        println(myArrayList.get(i))
    }

    myArrayList.remove("10")
    myArrayList.add("10")
    println()
    for (i in 0 until myArrayList.size()) {
        println(myArrayList.get(i))
    }

    myArrayList.removeAt(4)
    println()
    for (i in 0 until myArrayList.size()) {
        println(myArrayList.get(i))
    }

    myArrayList.removeAt(3)
    println()
    println("size = ${myArrayList.size()}")
    for (i in 0 until myArrayList.size()) {
        println(myArrayList.get(i))
    }
}