package videoCourse_02.lessons.lesson05_lambda;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentInfoLambda {

    void testStudent(ArrayList<Student> al, StudentCheck sc) {
        for (Student s : al) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }
}

interface StudentCheck {
    boolean check(Student s);
}

class CheckOverGrade implements StudentCheck {
    @Override
    public boolean check(Student s) {
        return s.avgGrade > 8;
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

        StudentInfoLambda info = new StudentInfoLambda();
        info.testStudent(students, new CheckOverGrade()); // отдельный класс, но применяется, если многократно необходимо выполнить одну и туже операцию
        // info.printStudentsOverGrade(students, 8); - аналог из примера StudentInfo
        System.out.println("------------------------");
        info.testStudent(students, new StudentCheck() { // anonymous class, можно записать в виде лямбда-выражения
            @Override
            public boolean check(Student s) {
                return s.age < 30;
            }
        });
        // info.printStudentsUnderAge(students, 30); - аналог из примера StudentInfo
        System.out.println("------------------------");
        info.testStudent(students, s ->
                s.age > 20 && s.avgGrade < 9.5 && s.sex == 'f'); // lambda expression
        // info.printStudentsMixCondition(students, 20, 9.5, 'f'); - аналог из примера StudentInfo
        System.out.println("------------------------");


        info.testStudent(students, s -> s.age > 30); // - 1-ый вариант
        StudentCheck sc = s -> s.age > 30; // результат лямбда-выражения присваивается переменной
        info.testStudent(students, sc); // - 2-ой вариант
        System.out.println("------------------------");

        Collections.sort(students, new Comparator<Student>() { // - 1-ый вариант сортировки с помощью анонимного класса
            @Override
            public int compare(Student s1, Student s2) {
                return s1.course - s2.course;
            }
        });
        Collections.sort(students, (s1,s2) -> s1.course - s2.course); // - 2-ой вариант сортировки с помощью lambda
        System.out.println(students);
    }
}