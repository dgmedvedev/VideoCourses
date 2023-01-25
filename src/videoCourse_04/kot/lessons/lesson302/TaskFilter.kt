package videoCourse_04.kot.lessons.lesson302

fun main() {
    val listNames: MutableList<String> = mutableListOf()
    listNames.add("Ivan")
    listNames.add("Andrey")
    listNames.add("Petr")
    listNames.add("Alex")
    listNames.add("Anna")
    listNames.add("Oleg")

    val listNamesA = listNames.filter { it[0] == 'A' } // it.startsWith("A")
    println(listNamesA)
}