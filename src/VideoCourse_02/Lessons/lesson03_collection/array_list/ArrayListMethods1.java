package VideoCourse_02.Lessons.lesson03_collection.array_list;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Petr", 'm', 23, 4, 7.3);
        Student st3 = new Student("Sidr", 'm', 24, 5, 7.9);
        Student st4 = new Student("Masha", 'f', 18, 1, 6.9);
        Student st5 = new Student("Olga", 'f', 18, 1, 9.6);
        Student st6 = new Student("Sidr", 'm', 24, 5, 7.9);

        ArrayList<Student> arrayList1 = new ArrayList<>();
        arrayList1.add(st1);
        arrayList1.add(st2);
        arrayList1.add(st3);
        arrayList1.add(1, st4);
        System.out.println(arrayList1);
        arrayList1.set(1, st5);
        System.out.println(arrayList1);
        arrayList1.remove(0);
        System.out.println(arrayList1);
        arrayList1.remove(st6); // удаляется объект st3.equals(st6), т.к. метод equals переопределен (иначе st3==st6 - false)
        System.out.println(arrayList1);
    }
}

class Student {
    String name;
    char sex;
    int age, course;
    double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex && age == student.age && course == student.course &&
                Double.compare(student.avgGrade, avgGrade) == 0 &&
                Objects.equals(name, student.name);
    }
}