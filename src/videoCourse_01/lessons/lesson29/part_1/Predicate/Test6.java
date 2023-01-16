package videoCourse_01.lessons.lesson29.part_1.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<Student6> list = new ArrayList<>();
        Student6 st1 = new Student6("Ivan", 'm', 22, 3, 8.3);
        Student6 st2 = new Student6("Nikolay", 'm', 28, 2, 6.4);
        Student6 st3 = new Student6("Elena", 'f', 19, 1, 8.9);
        Student6 st4 = new Student6("Petr", 'm', 35, 4, 7);
        Student6 st5 = new Student6("Mariya", 'f', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        StudentInfo6 si = new StudentInfo6();

        si.testStudents(list, (Student6 st) -> {return st.avgGrade > 8.5;});        // вариант 1 - запись лямбда-выражения - Самый длинный
        System.out.println("-------------------------------------------------");
        si.testStudents(list, (Student6 st) -> st.avgGrade < 9);                    // вариант 2 - запись лямбда-выражения
        System.out.println("-------------------------------------------------");
        si.testStudents(list, st -> st.age > 25);                                   // вариант 3 - запись лямбда-выражения - Самый короткий
        System.out.println("-------------------------------------------------");
        si.testStudents(list, st -> {return st.age < 27;});                         // вариант 4 - запись лямбда-выражения
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        si.testStudents(list, st -> {int z = 5; return st.age < 27;});              // вариант 5 - запись лямбда-выражения
        System.out.println("-------------------------------------------------");
        si.testStudents(list, (st) -> st.sex == 'm');                               // вариант 6 - запись лямбда-выражения
        System.out.println("-------------------------------------------------");
        si.testStudents(list, st -> st.avgGrade > 7.2 && st.age < 23 && st.sex == 'f');
    }
}

class Student6 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student6(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo6 {
    void printStudent(Student6 st) {
        System.out.println("Name: " + st.name + ", sex: " + st.sex + ", age: " + st.age +
                ", course: " + st.course + ", avgGrade: " + st.avgGrade);
    }

    void testStudents(ArrayList<Student6> list, Predicate<Student6> p) {
        for (Student6 st : list) {
            if (p.test(st)) {
                printStudent(st);
            }
        }
    }
}