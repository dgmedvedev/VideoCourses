package VideoCourse_02.Lessons.lesson07_multithreading;

public class SynchronizedObject {

    // для синхронизации по объекту обычно создают произвольный объект (LOCK).
    // без синхронизации (в данном случае) все методы выполнялись бы одновременно, несмотря на то, если бы методы
    // даже были бы synchronized
    static final Object LOCK = new Object();

    void sleep(long millis, String str) {
        try {
            Thread.sleep(millis);
            System.out.println(str);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    void mobileCall() {
        synchronized (LOCK) {
            System.out.println("Mobile call starts");
            sleep(3000, "Mobile call ends");
        }
    }

    void skypeCall() {
        synchronized (LOCK) {
            System.out.println("Skype call starts");
            sleep(5000, "Skype call ends");
        }
    }

    void whatsAppCall() {
        synchronized (LOCK) {
            System.out.println("Whatsapp call starts");
            sleep(7000, "Whatsapp call ends");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImpMobile());
        Thread thread2 = new Thread(new RunnableImpSkype());
        Thread thread3 = new Thread(new RunnableImpWhatsApp());
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RunnableImpMobile implements Runnable {
    public void run() {
        new SynchronizedObject().mobileCall();
    }
}

class RunnableImpSkype implements Runnable {
    public void run() {
        new SynchronizedObject().skypeCall();
    }
}

class RunnableImpWhatsApp implements Runnable {
    public void run() {
        new SynchronizedObject().whatsAppCall();
    }
}