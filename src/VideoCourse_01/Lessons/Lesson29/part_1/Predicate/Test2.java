package VideoCourse_01.Lessons.Lesson29.part_1.Predicate;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Student2> list = new ArrayList<>();
        Student2 st1 = new Student2("Ivan", 'm', 22, 3, 8.3);
        Student2 st2 = new Student2("Nikolay", 'm', 28, 2, 6.4);
        Student2 st3 = new Student2("Elena", 'f', 19, 1, 8.9);
        Student2 st4 = new Student2("Petr", 'm', 35, 4, 7);
        Student2 st5 = new Student2("Mariya", 'f', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        StudentInfo2 si = new StudentInfo2();
        FindStudentOverGrade2 findStudentOverGrade = new FindStudentOverGrade2();
        FindStudentUnderGrade2 findStudentUnderGrade = new FindStudentUnderGrade2();
        FindStudentOverAge2 findStudentOverAge = new FindStudentOverAge2();
        FindStudentUnderAge2 findStudentUnderAge = new FindStudentUnderAge2();
        FindStudentBySex2 findStudentBySex = new FindStudentBySex2();
        FindStudentMixCondition2 findStudentMixCondition = new FindStudentMixCondition2();

        si.testStudents(list, findStudentOverGrade);
        System.out.println("-------------------------------------------------");
        si.testStudents(list, findStudentUnderGrade);
        System.out.println("-------------------------------------------------");
        si.testStudents(list, findStudentOverAge);
        System.out.println("-------------------------------------------------");
        si.testStudents(list, findStudentUnderAge);
        System.out.println("-------------------------------------------------");
        si.testStudents(list, findStudentBySex);
        System.out.println("-------------------------------------------------");
        si.testStudents(list, findStudentMixCondition);
    }
}

class Student2 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student2(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo2 {
    void printStudent(Student2 st) {
        System.out.println("Name: " + st.name + ", sex: " + st.sex + ", age: " + st.age +
                ", course: " + st.course + ", avgGrade: " + st.avgGrade);
    }

    void testStudents(ArrayList<Student2> list, StudentChecks2 sc) {
        for (Student2 s : list) {
            if (sc.test(s)) {
                printStudent(s);
            }
        }
    }
}

interface StudentChecks2 {
    boolean test(Student2 s);
}

class FindStudentOverGrade2 implements StudentChecks2 {
    @Override
    public boolean test(Student2 s) {
        return s.avgGrade > 8.5;
    }
}

class FindStudentUnderGrade2 implements StudentChecks2 {
    @Override
    public boolean test(Student2 s) {
        return s.avgGrade < 9;
    }
}

class FindStudentOverAge2 implements StudentChecks2 {
    @Override
    public boolean test(Student2 s) {
        return s.age > 25;
    }
}

class FindStudentUnderAge2 implements StudentChecks2 {
    @Override
    public boolean test(Student2 s) {
        return s.age < 27;
    }
}

class FindStudentBySex2 implements StudentChecks2 {
    @Override
    public boolean test(Student2 s) {
        return s.sex == 'm';
    }
}

class FindStudentMixCondition2 implements StudentChecks2 {
    @Override
    public boolean test(Student2 s) {
        return (s.avgGrade > 7.2 && s.age < 23 && s.sex == 'f');
    }
}