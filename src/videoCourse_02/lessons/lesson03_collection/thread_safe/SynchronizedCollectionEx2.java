package videoCourse_02.lessons.lesson03_collection.thread_safe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollectionEx2 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }
        List<Integer> synchList = Collections.synchronizedList(arrayList);
        Runnable runnable1 = () -> {
            // чтобы обезопасить приложение от вызова Exception, необходимо целиком блокировать List на время перебора
            synchronized (synchList) {
                for (Integer integer : synchList) {
                    System.out.println(integer);
                }
            }
        };
        Runnable runnable2 = () -> synchList.remove(10);

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(synchList);
    }
}