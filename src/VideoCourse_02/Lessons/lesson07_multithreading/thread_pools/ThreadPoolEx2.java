package VideoCourse_02.Lessons.lesson07_multithreading.thread_pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolEx2 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new RunnableImp200());
        }
        executorService.shutdown();
    }
}

class RunnableImp200 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}