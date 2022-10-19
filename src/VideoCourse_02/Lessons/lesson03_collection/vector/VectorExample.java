package VideoCourse_02.Lessons.lesson03_collection.vector;

import java.util.Vector;

// Vector - устаревший synchronized класс (является super классом Stack), не рекомендуется к использованию
public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Ivan");
        vector.add("Petr");
        vector.add("Oleg");
        vector.add("Katya");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(2);
        System.out.println(vector);
        System.out.println(vector.get(1));
    }
}