package videoCourse_02.lessons.lesson07_multithreading.thread_pools;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx301 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(1);
        for (int i = 0; i < 3; i++) {
            // задание начнет выполняться через 3 сек
            scheduledExecutorService.schedule(new RunnableImp301(), 3, TimeUnit.SECONDS);
        }
        scheduledExecutorService.shutdown();
    }
}

class RunnableImp301 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}