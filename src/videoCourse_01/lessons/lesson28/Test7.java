package videoCourse_01.lessons.lesson28;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Test7 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2022, Month.SEPTEMBER, 27, 13, 40, 33);

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd MMMM, yyyy, hh:mm");
        System.out.println(ldt);
        System.out.println(ldt.format(f1));

        // 3 способа инициализации LocalDate, LocalTime или LocalDateTime
        LocalDate ld = LocalDate.of(2022, 9, 27);
        System.out.println("ld: " + ld);
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate ld1 = LocalDate.parse("27 09 2022", f2); // создание ld1 с помощью parse() и f2
        System.out.println("ld1: " + ld1);
        LocalDate ld2 = LocalDate.parse("2022-09-27"); // создание ld2 с помощью parse() и default репрезентации LocalDate
        System.out.println("ld2: " + ld2);
    }
}