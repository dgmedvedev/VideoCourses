package videoCourse_02.lessons.lesson07_multithreading.synchronizer.semaphore;

import java.util.concurrent.Semaphore;

// 2 телефонные будки, 5 желающих позвонить
public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);

        new Person("Dima", callBox);
        new Person("Oleg", callBox);
        new Person("Elena", callBox);
        new Person("Ivan", callBox);
        new Person("Semen", callBox);
    }
}

class Person extends Thread {
    String name;
    private final Semaphore CALL_BOX;

    public Person(String name, Semaphore CALL_BOX) {
        this.name = name;
        this.CALL_BOX = CALL_BOX;
        this.start();
    }

    public void run() {
        try {
            System.out.println(name + " ждёт...");
            CALL_BOX.acquire(); // заблокирует поток пока ресурс не будет доступен
            System.out.println(name + " пользуется телефоном...");
            sleep(2000);
            System.out.println(name + " завершил звонок...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            CALL_BOX.release(); // освободит ресурс (semaphore counter увеличится на 1)
        }
    }
}