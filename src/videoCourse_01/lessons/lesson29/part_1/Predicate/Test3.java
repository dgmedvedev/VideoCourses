package videoCourse_01.lessons.lesson29.part_1.Predicate;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Student3> list = new ArrayList<>();
        Student3 st1 = new Student3("Ivan", 'm', 22, 3, 8.3);
        Student3 st2 = new Student3("Nikolay", 'm', 28, 2, 6.4);
        Student3 st3 = new Student3("Elena", 'f', 19, 1, 8.9);
        Student3 st4 = new Student3("Petr", 'm', 35, 4, 7);
        Student3 st5 = new Student3("Mariya", 'f', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        StudentInfo3 si = new StudentInfo3();

        si.testStudents(list, (Student3 st) -> {return st.avgGrade > 8.5;});        // вариант 1 - запись лямбда-выражения - Самый длинный
        System.out.println("-------------------------------------------------");
        si.testStudents(list, (Student3 st) -> st.avgGrade < 9);                    // вариант 2 - запись лямбда-выражения
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

class Student3 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student3(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo3 {
    void printStudent(Student3 st) {
        System.out.println("Name: " + st.name + ", sex: " + st.sex + ", age: " + st.age +
                ", course: " + st.course + ", avgGrade: " + st.avgGrade);
    }

    void testStudents(ArrayList<Student3> list, StudentChecks sc) {
        for (Student3 st : list) {
            if (sc.test(st)) {
                printStudent(st);
            }
        }
    }
}

interface StudentChecks {
    boolean test(Student3 st);
}