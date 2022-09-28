package VideoCourse_01.Lessons.Lesson29;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<>();
        Student1 st1 = new Student1("Ivan", 'm', 22, 3, 8.3);
        Student1 st2 = new Student1("Nikolay", 'm', 28, 2, 6.4);
        Student1 st3 = new Student1("Elena", 'f', 19, 1, 8.9);
        Student1 st4 = new Student1("Petr", 'm', 35, 4, 7);
        Student1 st5 = new Student1("Mariya", 'f', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        StudentInfo1 si = new StudentInfo1();
        si.printStudentsOverGrade(list, 8.5);
        System.out.println("-----------------------------------------------");
        si.printStudentsUnderGrade(list, 9);
        System.out.println("-----------------------------------------------");
        si.printStudentsOverAge(list, 25);
        System.out.println("-----------------------------------------------");
        si.printStudentsUnderAge(list, 27);
        System.out.println("-----------------------------------------------");
        si.printStudentsBySex(list, 'm');
        System.out.println("-----------------------------------------------");
        si.printStudentsMixCondition(list, 7.2, 23, 'f');
    }
}

class Student1 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student1(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo1 {
    void printStudent(Student1 st) {
        System.out.println("Name: " + st.name + ", sex: " + st.sex + ", age: " + st.age +
                ", course: " + st.course + ", avgGrade: " + st.avgGrade);
    }

    void printStudentsOverGrade(ArrayList<Student1> list, double avgGrade) {
        for (Student1 student : list) {
            if (student.avgGrade > avgGrade) {
                printStudent(student);
            }
        }
    }

    void printStudentsUnderGrade(ArrayList<Student1> list, double avgGrade) {
        for (Student1 student : list) {
            if (student.avgGrade < avgGrade) {
                printStudent(student);
            }
        }
    }

    void printStudentsOverAge(ArrayList<Student1> list, int age) {
        for (Student1 student : list) {
            if (student.age > age) {
                printStudent(student);
            }
        }
    }

    void printStudentsUnderAge(ArrayList<Student1> list, int age) {
        for (Student1 student : list) {
            if (student.age < age) {
                printStudent(student);
            }
        }
    }

    void printStudentsBySex(ArrayList<Student1> list, char sex) {
        for (Student1 student : list) {
            if (student.sex == sex) {
                printStudent(student);
            }
        }
    }

    void printStudentsMixCondition(ArrayList<Student1> list, double avgGrade, int age, char sex) {
        for (Student1 student : list) {
            if (student.avgGrade > avgGrade && student.age < age && student.sex == sex) {
                printStudent(student);
            }
        }
    }
}