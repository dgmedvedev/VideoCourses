package VideoCourse_02.Lessons.lesson07_multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExampleATM {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Employee("Ivan", lock);
        new Employee("Petr", lock);
        new Employee("Oleg", lock);
        new Employee("Dmitry", lock);
        new Employee("Maksim", lock);
    }
}

class Employee extends Thread {
    String name;
    private final Lock LOCK;

    public Employee(String name, Lock LOCK) {
        this.name = name;
        this.LOCK = LOCK;
        this.start(); // при создании Employee поток сразу запустится
    }

    public void run() {
        try {
            System.out.println(name + " ждёт...");
            LOCK.lock();
            System.out.println(name + " пользуется банкоматом");
            Thread.sleep(2000);
            System.out.println(name + " завершил свои дела");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            LOCK.unlock();
        }
    }
}