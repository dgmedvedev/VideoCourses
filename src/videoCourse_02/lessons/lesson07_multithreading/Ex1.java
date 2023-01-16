package videoCourse_02.lessons.lesson07_multithreading;

public class Ex1 {
    public static void main(String[] args) {
        // программа выполняется одним потоком
        System.out.println("start");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("end");
    }
}