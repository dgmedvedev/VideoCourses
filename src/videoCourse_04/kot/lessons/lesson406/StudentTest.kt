package videoCourse_04.kot.lessons.lesson406

fun main() {
    val student1 = Student("Иван", "Иванов", "23451")
    val student2 = student1.copy()


    println(student1)
    println(student2)
    println(student1.hashCode())
    println(student2.hashCode())
    println(student1==student2)
    println(student1===student2)

    // деструктор (деструктивный оператор) - получает набор переменных из объекта
    // если какая-либо переменная не нужна, вместо нее используется знак _
    // val (name, _,id) = student1
    val (name, lastName,id) = student1
    println(name)
    println(lastName)
    println(id)
}