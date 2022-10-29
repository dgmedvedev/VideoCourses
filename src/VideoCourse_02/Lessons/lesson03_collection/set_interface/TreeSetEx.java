package VideoCourse_02.Lessons.lesson03_collection.set_interface;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Student> treeSet1 = new TreeSet<>();
        TreeSet<Student> treeSet2 = new TreeSet<>(new Comparator<Student>() {
            public int compare(Student st1, Student st2) {
                return st1.name.compareTo(st2.name);
            }
        });

        Student st1 = new Student("Vitaliy", 1);
        Student st2 = new Student("Andrey", 5);
        Student st3 = new Student("Oleg", 2);
        Student st4 = new Student("Masha", 4);
        Student st5 = new Student("Sveta", 3);
        treeSet1.add(st1);
        treeSet1.add(st2);
        treeSet1.add(st3);
        treeSet1.add(st4);
        treeSet1.add(st5);
        // treeSet1.add(null); -  TreeSet не может хранить null
        System.out.println(treeSet1);
        System.out.println("treeSet1.first() = " + treeSet1.first());
        System.out.println("treeSet1.last() = " + treeSet1.last());
        Student st6 = new Student("Olga", 3);
        Student st7 = new Student("Ira", 4);

        System.out.println(treeSet1.headSet(st6));  // выводит студентов, со значением course < 3
        System.out.println(treeSet1.tailSet(st6)); // выводит студентов, со значением: course >= 3
        System.out.println(treeSet1.subSet(st6, st7)); // выводит студентов, со значением: (3 <= course < 4)

        // ПРАВИЛО: если a.compareTo(b) = 0, то a.equals(b) должно вернуть true и hashCodes должны быть равны
        System.out.println(st5.compareTo(st6)); // = 0
        System.out.println(st5.equals(st6)); // должно вернуть true, переопределили в соответствием с ПРАВИЛОМ
        System.out.println(st5.hashCode() == st6.hashCode()); // - равны, переопределили в соответствием с ПРАВИЛОМ


        Student st10 = new Student("Vitaliy", 1);
        Student st11 = new Student("Andrey", 4);
        Student st12 = new Student("Oleg", 2);
        treeSet2.add(st10);
        treeSet2.add(st11);
        treeSet2.add(st12);
        System.out.println(treeSet2); // сортировка идет в соответствии с Comparatorом в конструкторе
        System.out.println("treeSet2.first() = " + treeSet2.first());
    }
}

class Student implements Comparable<Student> {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(Student other) {
        return this.course - other.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}