package videoCourse_01.lessons.lesson28;

import java.time.*;

public class Test5 {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2022, Month.SEPTEMBER, 26);
        Period period = Period.ofMonths(2);
        // Period period = Period.ofMonths(2).ofDays(2); - сработает только последний of
        System.out.println(start.plus(period));

        Duration duration = Duration.ofDays(2);
        // Duration duration2 = Duration.ofMonths(3).ofDays(2); - сработает только последний of

        // Duration работает только с объектами LocalTime и LocalDateTime (у которых есть временная часть)
        // System.out.println(start.plus(duration)); - Exception, т.к. start - LocalDate
        LocalDateTime ldt = LocalDateTime.of(2022, Month.SEPTEMBER, 26, 16, 10);
        System.out.println(ldt.plus(period).plus(duration).plus(Duration.ofMinutes(20).plus(Duration.ofMillis(20))));
    }
}