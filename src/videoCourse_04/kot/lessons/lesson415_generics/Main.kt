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
}