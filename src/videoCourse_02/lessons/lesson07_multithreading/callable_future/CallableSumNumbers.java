package videoCourse_02.lessons.lesson07_multithreading.callable_future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableSumNumbers {
    private static final long VALUE = 1_000_000_000L;
    private static long sum = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int sizePool = 10;
        ExecutorService executorService = Executors.newFixedThreadPool(sizePool);


        List<Future<Long>> futureResults = new ArrayList<>();
        long valueDividedBy10 = VALUE / sizePool;
        for (int i = 0; i < sizePool; i++) {
            long from = valueDividedBy10 * i + 1;
            long to = valueDividedBy10 * (i + 1);
            PartialSum task = new PartialSum(from, to);
            Future<Long> futurePartSum = executorService.submit(task);
            futureResults.add(futurePartSum);
        }
        for (Future<Long> result : futureResults) {
            sum += result.get();
        }
        executorService.shutdown();
        System.out.println("Total sum = " + sum);
    }
}

class PartialSum implements Callable<Long> {
    long from;
    long to;
    long localSum;

    public PartialSum(long from, long to) {
        this.from = from;
        this.to = to;
    }

    public Long call() {
        for (long i = from; i <= to; i++) {
            localSum += i;
        }
        System.out.println("Sum from " + from + " to " + to + " = " + localSum);
        return localSum;
    }
}