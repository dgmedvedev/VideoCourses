package videoCourse_04.kot.lessons.lesson406

class StudentCopy(val name: String, val lastName: String, val id: String) {
    fun copy(name: String = this.name, lastName: String = this.lastName, id: String = this.id): StudentCopy {
        return StudentCopy(name, lastName, id)
    }

    override fun toString(): String {
        return "StudentCopy(name='$name', lastName='$lastName', id='$id')"
    }
}