package videoCourse_01.homework.lesson14;

public class Time {
    static void showTime() {
        int sec = 0;
        OUTER:
        for (int hour = 0; hour < 6; hour++) {
            MIDDLE:
            for (int min = 0; min < 60; min++) {
                if (hour > 1 && min % 10 == 0 && min > 0) {
                    System.out.println("hour = " + hour);
                    System.out.println("min = " + min);
                    System.out.println("sec = " + sec);
                    break OUTER;
                }
                for (sec = 0; sec < 60; sec++) {
                    System.out.println(hour + " : " + min + " : " + sec);
                    if (sec * hour > min) {
                        continue MIDDLE;
                    }
                }
            }
        }
    }
}

class TimeTest {
    public static void main(String[] args) {
        Time.showTime();
    }
}