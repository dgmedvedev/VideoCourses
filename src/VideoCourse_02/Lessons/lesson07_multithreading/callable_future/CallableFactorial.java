package VideoCourse_02.Lessons.lesson07_multithreading.callable_future;

import java.util.concurrent.*;

public class CallableFactorial {
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        FactorialC factorialC = new FactorialC(5);
        Future<Integer> future = executorService.submit(factorialC);
        try {
            System.out.println(future.isDone());
            System.out.println("Хотим получить результат");
            factorialResult = future.get(); // выбрасывает Exception, т.к. call() выбрасывает Exception
            System.out.println("Получили результат");
            System.out.println(future.isDone());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            System.out.println(e.getCause().getMessage()); // getCause() показывает причину из-за которой вылетело Exception
        } finally { // всегда рекомендуется в finally блоке закрывать ExecutorService
            executorService.shutdown();
        }
        System.out.println(factorialResult);
    }
}

class FactorialC implements Callable<Integer> {
    int f;

    public FactorialC(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("You entered the wrong number");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
            Thread.sleep(500);
        }
        return result;
    }
}