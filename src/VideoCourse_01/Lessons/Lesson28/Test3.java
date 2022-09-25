package VideoCourse_01.Lessons.Lesson28;

import java.time.*;

public class Test3 {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.of(2022, 9, 25);
        LocalDate localDate2 = LocalDate.of(2022, 8, 25);
        System.out.println(localDate1.isAfter(localDate2));

        LocalTime localTime1 = LocalTime.of(22, 14);
        LocalTime localTime2 = LocalTime.of(22, 18);
        System.out.println(localTime1.isBefore(localTime2));

        LocalDateTime localDateTime1 = LocalDateTime.of(2022, 9, 25, 22, 15);
        LocalDateTime localDateTime2 = LocalDateTime.of(2022, 9, 25, 22, 15, 1);
        System.out.println(localDateTime1.isAfter(localDateTime2));
    }
}