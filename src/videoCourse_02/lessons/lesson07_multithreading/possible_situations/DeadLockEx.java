package videoCourse_02.lessons.lesson07_multithreading.possible_situations;

public class DeadLockEx {
    public static final Object LOCK1 = new Object();
    public static final Object LOCK2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();
    }
}

class Thread10 extends Thread {
    public void run() {
        System.out.println("Thread10: Попытка захватить монитор объекта LOCK1");
        synchronized (DeadLockEx.LOCK1) {
            System.out.println("Thread10: Монитор объекта LOCK1 захвачен");
            System.out.println("Thread10: Попытка захватить монитор объекта LOCK2");
            synchronized (DeadLockEx.LOCK2) {
                System.out.println("Thread10: Мониторы объектов LOCK1 и LOCK2 захвачены");
            }
        }
    }
}

class Thread20 extends Thread {
    public void run() {
        System.out.println("Thread20: Попытка захватить монитор объекта LOCK2");
        synchronized (DeadLockEx.LOCK2) { // если синхронизацию проводить в одинаковом порядке, Deadlock не будет
            System.out.println("Thread20: Монитор объекта LOCK2 захвачен");
            System.out.println("Thread20: Попытка захватить монитор объекта LOCK1");
            synchronized (DeadLockEx.LOCK1) {
                System.out.println("Thread20: Мониторы объектов LOCK1 и LOCK2 захвачены");
            }
        }
    }
}