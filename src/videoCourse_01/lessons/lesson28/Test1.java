package videoCourse_01.lessons.lesson28;

import java.time.*;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        //создание объектов LocalDate, LocalTime, LocalDateTime
        LocalDate localDate1 = LocalDate.of(2022, 9, 25);
        LocalDate localDate2 = LocalDate.of(2022, Month.SEPTEMBER, 25);
        System.out.println("localDate1: " + localDate1);
        System.out.println("localDate2: " + localDate2);

        LocalTime localTime1 = LocalTime.of(21, 23);
        LocalTime localTime2 = LocalTime.of(21, 24, 33);
        LocalTime localTime3 = LocalTime.of(21, 25, 33, 999999999);
        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);

        LocalDateTime localDateTime1 = LocalDateTime.of(2022, 9, 25, 21, 29);
        LocalDateTime localDateTime2 = LocalDateTime.of(2022, 9, 25, 21, 31, 30);
        LocalDateTime localDateTime3 = LocalDateTime.of(2022, 9, 25, 21, 32, 5, 999999999);
        LocalDateTime localDateTime4 = LocalDateTime.of(2022, Month.SEPTEMBER, 25, 21, 32);
        LocalDateTime localDateTime5 = LocalDateTime.of(2022, Month.SEPTEMBER, 25, 21, 33, 15);
        LocalDateTime localDateTime6 = LocalDateTime.of(2022, Month.SEPTEMBER, 25, 21, 33, 30, 333);
        LocalDateTime localDateTime7 = LocalDateTime.of(localDate1, localTime3);
        System.out.println("localDateTime1: " + localDateTime1);
        System.out.println("localDateTime2: " + localDateTime2);
        System.out.println("localDateTime3: " + localDateTime3);
        System.out.println("localDateTime4: " + localDateTime4);
        System.out.println("localDateTime5: " + localDateTime5);
        System.out.println("localDateTime6: " + localDateTime6);
        System.out.println("localDateTime7: " + localDateTime7);
    }
}
