package VideoCourse_01.Lessons.Lesson14;

public class Test1 {
    public static void main(String[] args) {


        OUTER:
        for (int i = 1, j = 2, k = 3; i < 10 && j < 6; i++, j++, k += 10) {
            for (int l = 1; l < 10; l++) {
                if (i == 5) {
                    break OUTER;
                }
            }
            System.out.println(i);
            System.out.println(k);
        }
    }
}
