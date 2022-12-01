package VideoCourse_02.Lessons.lesson03_collection.thread_safe;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx1 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.offer(5); // ошибка не вылетает (в отличие от add()), но и элемент не добавляется
        System.out.println(queue);
    }
}