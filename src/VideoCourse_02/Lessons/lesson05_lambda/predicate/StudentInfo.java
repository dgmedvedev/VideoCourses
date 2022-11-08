package VideoCourse_02.Lessons.lesson05_lambda.predicate;

import VideoCourse_02.Lessons.lesson05_lambda.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

// Predicate в данном примере используется вместо интерфейса StudentCheck
public class StudentInfo {

    void testStudent(ArrayList<Student> al, Predicate<Student> pr) {
        for (Student s : al) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }
}

class TestLambda {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();

        Predicate<Student> p1 = student -> student.getAvgGrade() > 7.5;
        Predicate<Student> p2 = student -> student.getSex() == 'm';

        info.testStudent(students, p1.and(p2));
        System.out.println("------------------------");

        info.testStudent(students, new Predicate<Student>() {
            @Override
            public boolean test(Student s) {
                return s.getAge() < 30;
            }
        });
        // info.printStudentsUnderAge(students, 30); - аналог из примера StudentInfo
        System.out.println("------------------------");


        info.testStudent(students, s -> s.getAge() > 30); // - 1-ый вариант
        Predicate<Student> p = s -> s.getAge() > 30; // результат лямбда-выражения присваивается переменной
        info.testStudent(students, p); // - 2-ой вариант
        System.out.println("------------------------");

        Collections.sort(students, new Comparator<Student>() { // - 1-ый вариант сортировки с помощью анонимного класса
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getCourse() - s2.getCourse();
            }
        });
        Collections.sort(students, (s1, s2) -> s1.getCourse() - s2.getCourse()); // - 2-ой вариант сортировки с помощью lambda
        System.out.println(students);
    }
}