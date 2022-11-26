package VideoCourse_02.Lessons.lesson07_multithreading.callable_future;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunnableFactorial {
    static int factorialResult;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        FactorialR factorial = new FactorialR(5);
        executorService.execute(factorial);
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(factorialResult);
    }
}

// для выполнения нижеприведенной задачи больше подойдет интерфейс Callable
class FactorialR implements Runnable {
    int f;

    public FactorialR(int f) {
        this.f = f;
    }

    @Override
    public void run() {
        if (f <= 0) {
            System.out.println("You entered the wrong number"); // 1. в run() нельзя выбросить Exception вместо if
            return;
        }

        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        RunnableFactorial.factorialResult = result; // 2. приходится использовать переменную вне Runnable
    }
}