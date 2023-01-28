package videoCourse_04.kot.lessons.lesson304

fun main() {
    val names = listOf("Andrej", "Sveta", "Alex", "Oleg", "Nik", "Mariya", "Elena", "Max", "Dan", "Sergei")
    val listNames = ArrayList<String>()
    val listPhoneNumbers = ArrayList<String>()

    for (i in 0 until 1000) {
        val random = (Math.random() * names.size).toInt()
        listNames.add(names[random])
    }

    for (i in 0 until 1000) {
        val phoneNumber =
            when {
                i < 10 -> "+7-911-000-00-0$i"
                i in 10 until 100 -> "+7-911-000-00-$i"
                else -> "+7-911-000-0${i / 100}-${(i % 100) / 10}${i % 10}"
            }
        listPhoneNumbers.add(phoneNumber)
    }

    println(listNames)
    println(listPhoneNumbers)
}