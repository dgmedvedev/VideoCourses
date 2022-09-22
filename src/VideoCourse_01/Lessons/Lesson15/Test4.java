package VideoCourse_01.Lessons.Lesson15;

public class Test4 {
    public static void main(String[] args) {
        OUTER:
        for (int hour = 0; hour < 24; hour++) {
            int min = 0;
            INNER:
            while (min < 60) {
                System.out.println(hour + " : " + min);
                min++;
            }
        }
    }
}
