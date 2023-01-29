package videoCourse_04.kot.lessons.lesson304

import java.util.regex.Pattern

fun main() {
    val fullNames = mutableListOf<String>()
    fullNames.add("Ivanov Ivan")
    fullNames.add("Petrov Petr")
    fullNames.add("Sidorov Sidr")
    val surnames = ArrayList<String>()
    val names = ArrayList<String>()
//    val surnames = fullNames.map { it.substringBefore(" ") } - готовое решение без Pattern и Matcher
//    val names = fullNames.map { it.substringAfter(" ") }
    for (i in 0 until fullNames.size) {
        val array = ArrayList<String>()
        val pattern = Pattern.compile("\\w+")
        val matcher = pattern.matcher(fullNames[i])
        while (matcher.find()) {
            array.add(matcher.group())
        }
        surnames.add(array[0])
        names.add(array[1])
    }
    val pair = surnames.zip(names)
    for (o in pair) {
        println("Фамилия: ${o.first}, Имя: ${o.second}")
    }
}