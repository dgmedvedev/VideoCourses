package videoCourse_04.kot.homework.lesson413

class MyRandom {
    companion object {
        fun getRandomInt(range: Int) = (Math.random() * range).toInt()
        fun getRandomBoolean(): Boolean {
            val array = arrayOf(true, false)
            val random = (Math.random() * array.size).toInt()
            return array[random]
        }
    }
}