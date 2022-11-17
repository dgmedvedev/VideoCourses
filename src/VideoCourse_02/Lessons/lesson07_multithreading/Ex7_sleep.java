package VideoCourse_02.Lessons.lesson07_multithreading;

public class Ex7_sleep {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Go, go, go!");
    }
}