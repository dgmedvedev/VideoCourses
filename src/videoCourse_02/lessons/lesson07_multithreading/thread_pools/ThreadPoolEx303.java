package videoCourse_02.lessons.lesson07_multithreading.thread_pools;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx303 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(1);
        // задание начнет выполняться через 3 сек, с периодичностью в 1 сек
        // период здесь - это время между КОНЦОМ выполнения первого задания и НАЧАЛОМ выполнения второго задания
        // закончит выполняться через 10 сек, т.к. сработает метод shutdown()
        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImp303(), 3, 1, TimeUnit.SECONDS);

        Thread.sleep(10000);
        scheduledExecutorService.shutdown();
    }
}

class RunnableImp303 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}