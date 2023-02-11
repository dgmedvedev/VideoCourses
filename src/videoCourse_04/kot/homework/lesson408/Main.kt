package videoCourse_04.kot.homework.lesson408

fun main() {
    val listEmployee = mutableListOf<Employee>()
    val listLanguageProgramming = listOf("Java", "Kotlin", "JS", "Python", "Swift", "C#", "C++")

    for (i in 1..10) {
        val random = (Math.random() * listLanguageProgramming.size).toInt()
        val employee = Employee("Employee $i", 25 + i)
        val programmer = Programmer("Programmer $i", 25 + i * 2, listLanguageProgramming[random])
        listEmployee.add(employee)
        listEmployee.add(programmer)
    }

    for (employee in listEmployee) {
        employee.work()
    }
}