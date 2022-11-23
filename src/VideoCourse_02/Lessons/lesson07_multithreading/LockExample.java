package VideoCourse_02.Lessons.lesson07_multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    public static void main(String[] args) {
        Call call = new Call();
        Thread thread1 = new Thread(call::mobileCall);
        Thread thread2 = new Thread(call::skypeCall);
        Thread thread3 = new Thread(call::whatsappCall);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Call {
    private final Lock LOCK = new ReentrantLock();

    void sleep(long millis, String str) {
        try {
            Thread.sleep(millis);
            System.out.println(str);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            LOCK.unlock();
        }
    }

    void mobileCall() {
        LOCK.lock();
        System.out.println("Mobile call starts");
        sleep(3000, "Mobile call ends");
    }

    void skypeCall() {
        LOCK.lock();
        System.out.println("Skype call starts");
        sleep(5000, "Skype call ends");
    }

    void whatsappCall() {
        LOCK.lock();
        System.out.println("Whatsapp call starts");
        sleep(7000, "Whatsapp call ends");
    }
}