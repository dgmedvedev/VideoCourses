package videoCourse_02.lessons.lesson07_multithreading;

public class Ex4 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        }).start();

        new Thread(() -> System.out.println("hello")).start();
    }
}