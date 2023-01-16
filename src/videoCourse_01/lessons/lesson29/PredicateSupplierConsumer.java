package videoCourse_01.lessons.lesson29;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateSupplierConsumer {
    public static void main(String[] args) {
        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(new Student("Ivan", 1, 9.9));
        list1.add(new Student("Petr", 2, 8.8));
        list1.add(new Student("Sidr", 3, 8.8));

        System.out.println("List1: " + list1);
        StudentInfo.testPredicate(list1, s -> s.avgGrade == 8.8);
        System.out.println("-------------------------------------------------");
        StudentInfo.testPredicate(list1, s -> s.avgGrade == 8.8 && s.course > 2);
        System.out.println("-------------------------------------------------");

        ArrayList<Student> list2 = StudentInfo.testSupplier(() -> new Student("Supplier", 4, 7.7));
        System.out.println("List2: " + list2);
        System.out.println("-------------------------------------------------");

        StudentInfo.testConsumer(list2.get(0), student -> {
            student.name = "Consumer";
            student.course = 5;
            student.avgGrade = 10;
        });
        System.out.println("List2: " + list2);
    }
}

class Student {
    String name;
    int course;
    double avgGrade;

    Student(String name, int course, double avgGrade) {
        this.name = name;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String toString() {
        return "Name: " + name + ", course: " + course + ", avgGrade: " + avgGrade;
    }
}

class StudentInfo {
    static void printStudent(Student s) {
        System.out.println(s);
    }

    static void testPredicate(ArrayList<Student> list, Predicate<Student> predicate) {
        for (Student s : list) {
            if (predicate.test(s)) {
                printStudent(s);
            }
        }
    }

    static ArrayList<Student> testSupplier(Supplier<Student> supplier) {
        ArrayList<Student> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(supplier.get());
        }
        return list;
    }

    static void testConsumer(Student s, Consumer<Student> consumer) {
        consumer.accept(s);
    }
}