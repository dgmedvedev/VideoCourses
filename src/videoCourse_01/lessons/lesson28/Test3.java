package videoCourse_01.lessons.lesson28;

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
        System.out.println("----------------------------------");

        LocalDate localDate = LocalDate.of(2022, Month.SEPTEMBER, 26);
        LocalDateTime localDateTime = LocalDateTime.of(2022, Month.SEPTEMBER, 26, 17, 6);

        System.out.println(localDate.getDayOfWeek());   //MONDAY
        System.out.println(localDate.getDayOfMonth());  //26
        System.out.println(localDate.getDayOfYear());   //269
        System.out.println(localDate.getMonth());       //SEPTEMBER
        System.out.println(localDate.getMonthValue());  //9
        System.out.println(localDate.getYear());        //2022

        LocalTime localTime = LocalTime.of(17, 14, 59);
        System.out.println(localTime.getNano());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getHour());

        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMinute());
    }
}