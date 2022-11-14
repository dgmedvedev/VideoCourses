package VideoCourse_02.Lessons.lesson06_stream;

import java.util.ArrayList;
import java.util.List;

// findFirst, min, max, limit, skip
public class Test10_findFirst_skip {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Student firstStudent = students.stream()
                .filter(el -> el.getSex() == 'f')
                .findFirst().get();
        System.out.println(firstStudent);
        System.out.println("--------------------------------------------");

        Student max = students.stream().max((x, y) -> x.getAge() - y.getAge()).get();
        System.out.println(max);
        Student min = students.stream().min((x, y) -> x.getAge() - y.getAge()).get();
        System.out.println(min);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

        students.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------");
        students.stream().filter(el -> el.getAge() > 18).limit(2).forEach(System.out::println);
        System.out.println("--------------------------------------------");
        students.stream().filter(el -> el.getAge() > 18).skip(2).forEach(System.out::println);
    }
}