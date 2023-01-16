package videoCourse_01.homework.lesson28;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Lesson28 {

    DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

    void shift(LocalDateTime start, LocalDateTime end, Period p, Duration d) {
        LocalDateTime temp = start;
        while (temp.isBefore(end)) {
            System.out.print("Работаем с: (" + temp.format(formatter1) + ")  ");
            temp = temp.plus(p);
            System.out.println("До: (" + temp.format(formatter1) + ")");
            System.out.print("Отдыхаем с: (" + temp.format(formatter2) + ")  ");
            temp = temp.plus(d);
            System.out.println("До: (" + temp.format(formatter2) + ")");
        }
    }

    public static void main(String[] args) {
        LocalDateTime localDateTime1 = LocalDateTime.of(2022, Month.JANUARY, 1, 8, 30);
        LocalDateTime localDateTime2 = LocalDateTime.of(2022, Month.SEPTEMBER, 1, 8, 30);
        Period period = Period.ofMonths(1);
        Duration duration = Duration.ofDays(7);

        Lesson28 test = new Lesson28();
        test.shift(localDateTime1, localDateTime2, period, duration);
    }
}