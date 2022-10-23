package VideoCourse_02.Lessons.lesson03_collection.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx2 {
    public static void main(String[] args) {
        Map<Student2, Double> map = new HashMap<>(16, 0.75f); // default значения 16 и 0.75

        Student2 st1 = new Student2("Ivan", "Ivanov", 3);
        Student2 st2 = new Student2("Petr", "Petrov", 1);
        Student2 st3 = new Student2("Sidr", "Sidorov", 2);
        map.put(st1, 7.7);
        map.put(st2, 8.7);
        map.put(st3, 9.7);
        System.out.println(map);

        // очень важно, чтобы key был immutable объектом. Для этого класс Student преобразуем в final
        System.out.println(map.containsKey(st1)); // true
        System.out.println(st1.hashCode());
        // st1.course = 4; // если значение изменилось, то и hashCode изменится и такого объекта в map нету
        // System.out.println(map.containsKey(st1)); // false
        // System.out.println(st1.hashCode());
    }
}

final class Student2 {
    private final String name;
    private final String surname;
    private final int course;

    public Student2(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student2 student = (Student2) object;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}