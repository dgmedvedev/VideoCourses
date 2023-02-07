package videoCourse_04.kot.lessons.lesson403

class Cat(val name: String, val age: Int, val weight: Float = 0F) {
    override fun toString(): String {
        return "Cat(name='$name', age=$age, weight=$weight)"
    }

    // Вместо метода, указанного ниже, в классе CatTest создали extension функцию
    //fun isOld() = age >= 12
}