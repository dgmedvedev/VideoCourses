package videoCourse_04.kot.homework.lesson410

class Sportsman {
    fun invokeWaterCarrier(waterCarrier: WaterCarrier) {
        waterCarrier.bringWater()
    }

    // Решение с помощью lambda-выражения, без использования интерфейса.
    // Если не использовать ключевое слово inline,
    // то подкапотная реализация метода , будет как в примере выше
    // и потребует больше ресурсов и времени выполнения
    inline fun invokeWaterCarrier(bringWater: () -> Unit) {
        bringWater()
    }
}