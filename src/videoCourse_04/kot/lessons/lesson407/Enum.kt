package videoCourse_04.kot.lessons.lesson407

import videoCourse_04.kot.lessons.lesson407.Month.*
import videoCourse_04.kot.lessons.lesson407.Season.*

fun main() {
    val season = when (JANUARY) {
        DECEMBER, JANUARY, FEBRUARY -> WINTER
        MARCH, APRIL, MAY -> SPRING
        JUNE, JULY, AUGUST -> SUMMER
        SEPTEMBER, OCTOBER, NOVEMBER -> AUTUMN
    }
    println(season)
    println(season.tempAverage)
}