package VideoCourse_03.Lessons.lesson27;

public class MyThread {
    public static void main(String[] args) {
        Thread timer = new Thread(() -> System.out.println("run"));
        Thread timer2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Runnable sleep 1sec");
            }
        });
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("new Thread");
            }
        }).start();

        timer.start();
        timer2.start();
    }
}