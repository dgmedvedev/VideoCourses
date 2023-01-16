package videoCourse_01.lessons.lesson28;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Test6 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(11, 33);
        LocalDate localDate = LocalDate.of(2022, Month.SEPTEMBER, 27);
        LocalDateTime localDateTime = LocalDateTime.of(2022, Month.SEPTEMBER, 27, 11, 34, 30);
        // dateTimeFormatter1 определенного формата - ISO_LOCAL_DATE
        // ISO_LOCAL_... используется редко, только для взаимодейстия между ПК
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(localDate);
        System.out.println(localDate.format(dateTimeFormatter));// localDate.format(), работает только с ISO_LOCAL_DATE
        //System.out.println(localDate.format(DateTimeFormatter.ISO_LOCAL_DATE)); - тоже, что и строка выше

        System.out.println(localTime);
        System.out.println(localTime.format(DateTimeFormatter.ISO_LOCAL_TIME)); // localTime.format() работает только с ISO_LOCAL_TIME

        System.out.println("localDateTime: " + localDateTime);
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));        // работает и с Date и с Time
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));        // работает и с Date и с Time
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));   // работает и с Date и с Time

        System.out.println(localDate.format(DateTimeFormatter.ISO_WEEK_DATE));

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(localDateTime.format(formatter));
    }
}