package VideoCourse_02.Lessons.lesson07_multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerEx {
    static AtomicInteger counter = new AtomicInteger(0);

    public static void increment() {
        // counter++; - ниже приведен метод класса AtomicInteger, который выполняет тоже действие
        counter.addAndGet(1);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnableImpl());
        Thread thread2 = new Thread(new MyRunnableImpl());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("counter = " + counter);
    }
}

class MyRunnableImpl implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            AtomicIntegerEx.increment();
        }
    }
}