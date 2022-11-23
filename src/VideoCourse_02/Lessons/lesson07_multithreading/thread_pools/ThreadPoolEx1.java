package VideoCourse_02.Lessons.lesson07_multithreading.thread_pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx1 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new RunnableImp100());
        }
        executorService.shutdown(); // без этого метода программа не завершится, т.к. будет ждать еще задания
        executorService.awaitTermination(5, TimeUnit.SECONDS); // работает практически как join()
        System.out.println("main ends");
    }
}

class RunnableImp100 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}