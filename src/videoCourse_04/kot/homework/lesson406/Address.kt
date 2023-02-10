package videoCourse_04.kot.homework.lesson406

class Address(private val city: String, private val street: String, private val houseNumber: String) {

    operator fun component1() = city
    operator fun component2() = street
    operator fun component3() = houseNumber

    fun copy(city: String = this.city, street: String = this.street, houseNumber: String = this.houseNumber): Address {
        return Address(city, street, houseNumber)
    }

    override fun toString(): String {
        return "Address(city='$city', street='$street', houseNumber='$houseNumber')"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        if (this.hashCode() != other.hashCode()) return false
        val address = other as Address

        return city == address.city && street == address.street && houseNumber == address.houseNumber
    }

    override fun hashCode(): Int {
        var result = city.hashCode()
        result = 31 * result + street.hashCode()
        result = 31 * result + houseNumber.hashCode()
        return result
    }

//   override fun hashCode(): Int {
//      return Objects.hash(city, street, houseNumber)
//   }
}