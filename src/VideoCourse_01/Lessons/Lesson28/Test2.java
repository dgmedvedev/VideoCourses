package VideoCourse_01.Lessons.Lesson28;

import java.time.*;

public class Test2 {
    public static void main(String[] args) {
        // LocalDate, LocalTime, LocalDateTime являются immutable классами
        LocalDate localDate = LocalDate.of(2022, 9, 25);
        localDate = localDate.plusDays(15);
        localDate = localDate.minusDays(10);
        localDate = localDate.plusWeeks(3);         // minusWeeks(long number);
        localDate = localDate.plusMonths(3);       // minusMonths(long number);
        localDate = localDate.plusYears(1);          // minusYears(long number);
        System.out.println(localDate);

        LocalTime localTime = LocalTime.of(21, 57);
        localTime = localTime
                .plusHours(1)
                .minusMinutes(10)
                .plusSeconds(20)
                .minusNanos(12345);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime
                .of(2022, 9, 25, 22, 1, 38, 54321);
        System.out.println("localDateTime before: " + localDateTime);
        localDateTime = localDateTime
                .plusYears(1).minusMonths(12).plusWeeks(1).minusDays(7)
                .plusHours(3).minusMinutes(180).plusSeconds(3).minusNanos(3000000000L);
        System.out.println("localDateTime after: " + localDateTime);
    }
}