package videoCourse_04.kot.homework.lesson406

fun main() {
    val addressData1 = AddressData("Minsk", "Sablina", "32/2")
    val addressData2 = addressData1.copy()
    println(addressData1)
    println(addressData2)
    println(addressData1.hashCode())
    println(addressData2.hashCode())
    println(addressData1 == addressData2)
    val (city1, street1, houseNumber1) = addressData1
    println("City1: $city1, $street1, $houseNumber1")
    val (city2, street2, houseNumber2) = addressData2
    println("City2: $city2, $street2, $houseNumber2")

    val address1 = Address("Minsk", "Sablina", "32/2")
    val address2 = address1.copy()
    println(address1)
    println(address2)
    println(address1.hashCode())
    println(address2.hashCode())
    println(address1 == address2)
    val (city3, street3, houseNumber3) = address1
    println("City3: $city3, $street3, $houseNumber3")
    val (city4, street4, houseNumber4) = address2
    println("City4: $city4, $street4, $houseNumber4")
}