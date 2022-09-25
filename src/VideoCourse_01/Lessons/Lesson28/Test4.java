package VideoCourse_01.Lessons.Lesson28;

import java.time.*;

public class Test4 {
    static void changeDuty(LocalDate start, LocalDate end, Period period) {
        LocalDate date = start;
        while (date.isBefore(end)) {
            System.out.println("It's time to change: " + date);
            date = date.plus(period);
        }
    }

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2021, Month.SEPTEMBER, 25);
        LocalDate end = LocalDate.of(2022, Month.SEPTEMBER, 25);
        Period period = Period.ofMonths(2);

        changeDuty(start, end, period);

    }
}