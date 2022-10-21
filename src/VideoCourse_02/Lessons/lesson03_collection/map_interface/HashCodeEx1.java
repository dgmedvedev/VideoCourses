package VideoCourse_02.Lessons.lesson03_collection.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Ivan", "Ivanov", 3);
        Student st2 = new Student("Petr", "Petrov", 1);
        Student st3 = new Student("Sidr", "Sidorov", 2);
        map.put(st1, 7.7);
        map.put(st2, 8.7);
        map.put(st3, 9.7);
        System.out.println(map.entrySet());

        Student st4 = new Student("Ivan", "Ivanov", 3);

        System.out.println(map.containsKey(st4)); // true, т.к. переопределены hashCode() и equals()
        // в HashMap и HashSet, сравнение сначала идет по hashCode(), только затем по equals.
        // оба метода обязательно должны быть переопределены

        for (Map.Entry<Student, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

class Student {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
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
        Student student = (Student) object;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    // данная реализация метода может вызвать КОЛЛИЗИЮ
//    public int hashCode() {
//        return name.length() + surname.length() + course;
//    }
}