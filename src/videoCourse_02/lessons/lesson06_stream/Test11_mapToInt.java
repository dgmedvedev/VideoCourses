package videoCourse_02.lessons.lesson06_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test11_mapToInt {
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

        // когда нужно значения из stream записать в List<Integer>, обязательно нужно использовать boxed()
        // boxed() конвертирует значения int в Integer
        List<Integer> listInt = students.stream()
                .mapToInt(el->el.getCourse())
                .boxed()
                .collect(Collectors.toList());
        System.out.println(listInt);

        List<Double> listDouble = students.stream()
                .mapToDouble(el->el.getAvgGrade())
                .boxed()
                .collect(Collectors.toList());
        System.out.println(listDouble);

        int sum = students.stream().mapToInt(Student::getCourse).sum();
        int min = students.stream().mapToInt(Student::getCourse).min().getAsInt();
        int max = students.stream().mapToInt(Student::getCourse).max().getAsInt();
        double average = students.stream().mapToInt(Student::getCourse).average().getAsDouble();
    }
}