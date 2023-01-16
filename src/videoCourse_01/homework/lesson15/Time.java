package videoCourse_01.homework.lesson15;

public class Time {
    static void showTime() {
        int hour = 0;
        OUTER:
        while (hour < 6) {
            int min = -1;
            MIDDLE:
            do {
                min++;
                if (hour > 1 && min % 10 == 0 && min > 0) {
                    break OUTER;
                }
                int sec = 0;
                INNER:
                while (sec < 60) {
                    System.out.println(hour + " : " + min + " : " + sec);
                    if (sec * hour > min) {
                        continue MIDDLE;
                    }
                    sec++;
                }
            } while (min < 59);
            hour++;
        }
    }
}

class TimeTest {
    public static void main(String[] args) {
        Time.showTime();
    }
}