package VideoCourse_02.Lessons.lesson06_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test9_collect {
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

        // изменим студентам имена на заглавные буквы и отсортируем их по курсам, т.е. для каждого курса свой List
        Map<Integer, List<Student>> map1 = students.stream().map(el -> {
                    el.setName(el.getName().toUpperCase());
                    return el;
                })
                .collect(Collectors.groupingBy(el -> el.getCourse()));

        for (Map.Entry<Integer, List<Student>> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
        System.out.println("-------------------------------------------------------");

        // разделим студентов на тех, кто учится хорошо и плохо
        Map<Boolean, List<Student>> map2 = students.stream()
                .collect(Collectors.partitioningBy(el -> el.getAvgGrade() > 7));

        for (Map.Entry<Boolean, List<Student>> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
    }
}