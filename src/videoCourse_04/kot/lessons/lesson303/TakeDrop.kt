package videoCourse_04.kot.lessons.lesson303

fun main() {
    val array = (0..50).toList()
    val employee = array.map { "Employee №$it" }
    employee.take(10).forEach(System.out::println) // - вывод 10 первых элементов в консоль
    employee.takeLast(10).forEach(System.out::println) // - вывод 10 последних элементов в консоль
    println("--------------")
    employee.drop(10).forEach(System.out::println) // - вывод всех элементов, за исключением 10 первых
    employee.dropLast(10).forEach(System.out::println) // - вывод всех элементов, за исключением 10 последних
}