package VideoCourse_02.Lessons.lesson03_collection.map_interface;

import java.util.Hashtable;

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable<Double, Student> ht = new Hashtable<>();
        Student st1 = new Student("Ivan", "Ivanov", 3);
        Student st2 = new Student("Petr", "Petrov", 1);
        Student st3 = new Student("Sidr", "Sidorov", 4);
        Student st4 = new Student("Sergey", "Petrov", 2);

        ht.put(7.8, st1);
        ht.put(9.3, st2);
        ht.put(5.8, st3);
        ht.put(6.0, st4);
        // ht.put(null, null); - в Hashtable нельзя хранить null, вылетит Exception

        System.out.println(ht);
    }
}