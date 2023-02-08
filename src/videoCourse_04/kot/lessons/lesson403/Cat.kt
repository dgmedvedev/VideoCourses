package videoCourse_04.kot.lessons.lesson403

class Cat(val name: String, val age: Int, private val weight: Float = 0F) {

    val isOld: Boolean
        get() = age >= 12

    override fun toString(): String {
        return "Cat(name='$name', age=$age, weight=$weight)"
    }

    // Вместо метода, указанного ниже, в классе CatTest создали extension функцию,
    // но если функция по сути ничего не делает, а показывает какое-то св-во,
    // то лучше создать переменную (val isOld), и переопределить геттер
    //fun isOld() = age >= 12
}