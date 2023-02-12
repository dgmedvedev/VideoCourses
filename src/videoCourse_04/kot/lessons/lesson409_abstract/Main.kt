package videoCourse_04.kot.lessons.lesson409_abstract

fun main() {
    val listEmployee = mutableListOf<Employee>()
    val listLanguageProgramming = listOf("Java", "Kotlin", "JS", "Python", "Swift", "C#", "C++")

    for (i in 1..5) {
        val random = (Math.random() * listLanguageProgramming.size).toInt()
        val seller = Seller("Seller $i", 25 + i)
        val programmer = Programmer("Programmer $i", 25 + i * 2, listLanguageProgramming[random])
        listEmployee.add(seller)
        listEmployee.add(programmer)
    }
    val director = Director("Nik", 50)
    listEmployee.add(director)

    for (employee in listEmployee) {
        if (employee is Cleaner) {
            employee.clean()
        }
        employee.work()
    }

    val listCleaner = listEmployee
        .filter { it is Cleaner }
        .map { it as Cleaner }

    for (cleaner in listCleaner) {
        cleaner.clean()
    }
}