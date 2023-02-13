package videoCourse_04.kot.homework.lesson413

import videoCourse_04.kot.homework.lesson413.DaysOfWeek.*

class MyRandom {
    companion object {
        fun getRandomInt(from: Int, to: Int) = (Math.random() * (to - from + 1)).toInt() + from
        fun getRandomBoolean() = getRandomInt(0, 1) > 0

        fun getRandomDay(): String = when (getRandomInt(1, 7)) {
            1 -> MONDAY.toString()
            2 -> TUESDAY.toString()
            3 -> WEDNESDAY.toString()
            4 -> THURSDAY.toString()
            5 -> FRIDAY.toString()
            6 -> SATURDAY.toString()
            else -> SUNDAY.toString()
        }
    }
}