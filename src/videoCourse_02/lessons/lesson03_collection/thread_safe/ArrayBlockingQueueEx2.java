package videoCourse_02.lessons.lesson03_collection.thread_safe;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx2 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arrayBlockingQueue
                = new ArrayBlockingQueue<>(4);

        // Producer
        new Thread(() -> {
            int i = 0;
            while (true) {
                try {
                    arrayBlockingQueue.put(++i);
                    System.out.println("Producer add: " + i + " " + arrayBlockingQueue);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        // Consumer
        new Thread(() -> {
            while (true) {
                try {
                    Integer j = arrayBlockingQueue.take();
                    System.out.println("Consumer take " + j);
                    Thread.sleep(9000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}