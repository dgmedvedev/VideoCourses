package VideoCourse_02.Lessons.lesson03_collection.linked_list;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");
        System.out.println("LinkedList = " + linkedList);
        System.out.println("LinkedList.get(2) = " + linkedList.get(2));

        linkedList.add(2, "Hello");
        System.out.println("LinkedList = " + linkedList);
        System.out.println("LinkedList.get(2) = " + linkedList.get(2));

        linkedList.remove(2);
        System.out.println("LinkedList = " + linkedList);
        System.out.println("LinkedList.get(2) = " + linkedList.get(2));
    }
}