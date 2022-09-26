package VideoCourse_01.Lessons.Lesson28;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test6 {
    public static void main(String[] args) {
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