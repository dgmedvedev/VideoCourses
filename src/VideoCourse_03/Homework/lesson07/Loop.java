package VideoCourse_03.Homework.lesson07;

public class Loop {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (i % 5 == 0 && i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}