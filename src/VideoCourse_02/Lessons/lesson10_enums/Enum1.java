package VideoCourse_02.Lessons.lesson10_enums;

import java.util.Arrays;

public class Enum1 {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.MONDAY);
        today.daysInfo();
        today = new Today(WeekDays.SUNDAY);
        today.daysInfo();
        System.out.println(today.weekDay);

        WeekDays w1 = WeekDays.FRIDAY;
        WeekDays w2 = WeekDays.FRIDAY;
        System.out.println(w1 == w2); // - true
        System.out.println(WeekDays.FRIDAY.equals(WeekDays2.FRIDAY)); // - false, т.к. разные типы

        WeekDays w3 = WeekDays.valueOf("WEDNESDAY"); // enum из String, писать нужно без ошибок, иначе Exception
        System.out.println(w3);

        WeekDays[] array = WeekDays.values();
        System.out.println(Arrays.toString(array));
    }
}

enum WeekDays {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");

    final String mood;

    WeekDays(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}

enum WeekDays2 {
    FRIDAY
}

class Today {
    WeekDays weekDay;

    public Today(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    void daysInfo() {
        switch (weekDay) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("Go to work");
            case SATURDAY, SUNDAY -> System.out.println("Weekend");
        }
        System.out.println("Mood on this day: " + weekDay.getMood());
    }
}