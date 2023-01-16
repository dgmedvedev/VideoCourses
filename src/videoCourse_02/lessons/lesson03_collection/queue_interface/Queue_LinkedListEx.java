package videoCourse_02.lessons.lesson03_collection.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_LinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Ivan"); // add и offer добавляют элементы,
        queue.offer("Petr"); // но при ограниченной очереди у offer нет Exception при добавлении лишнего эл-та
        queue.offer("Marina");
        queue.offer("Sergey");
        queue.offer("Sasha");
        System.out.println(queue);

        System.out.println(queue.remove()); // удаляется 1-ый элемент (Ivan), т.к. Queue работает по правилу FIFO
        System.out.println(queue.remove("Sergey")); // удаляется "Sergey", но Queue для этого не предназначена!!!
        System.out.println(queue); // [Petr, Marina, Sasha]
        System.out.println(queue.element()); // возвращает первый элемент (Petr), т.к. Ivan уже удален
        System.out.println(queue.poll()); // удаляется 1-ый элемент, но в отличии от remove() - не вылетит Exception
        System.out.println(queue.poll()); // удаляется 1-ый элемент (Marina)
        System.out.println(queue.poll()); // удаляется 1-ый элемент (Sasha)
        System.out.println(queue.peek()); // возвращает первый элемент (null). если element(), то вылетит Exception
        System.out.println(queue.poll()); // null, с методом remove() вылетело бы Exception
        System.out.println(queue.poll()); // null
        System.out.println(queue);
    }
}