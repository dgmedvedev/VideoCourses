package VideoCourse_02.Lessons.lesson03_collection.thread_safe;

import java.util.ArrayList;

public class SynchronizedCollectionEx2 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }
        Runnable runnable1 = () -> {
            for (Integer integer : arrayList) {
                System.out.println(integer);
            }
        };
        Runnable runnable2 = () -> arrayList.remove(10);

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}