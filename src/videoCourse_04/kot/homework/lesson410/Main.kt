package videoCourse_04.kot.homework.lesson410

fun main() {
    val sportsman = Sportsman()
    sportsman.invokeWaterCarrier(object : WaterCarrier {
        override fun bringWater() {
            println("Водонос принес спортсмену воду")
        }
    })
}