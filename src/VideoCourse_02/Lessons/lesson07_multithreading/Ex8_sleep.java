package VideoCourse_02.Lessons.lesson07_multithreading;

public class Ex8_sleep extends Thread {
    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable1());
        Ex8_sleep thread2 = new Ex8_sleep();
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("The End!");
    }
}

class MyRunnable1 implements Runnable {
    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}