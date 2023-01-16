package videoCourse_02.lessons.lesson06_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test6_methodChaining {
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

        // имена сделать заглавными буквами, отфильтровать по полу (f), отсортировать по возрасту
        students.stream().map(el -> {
                    el.setName(el.getName().toUpperCase());
                    return el;
                })
                .filter(el -> el.getSex() == 'f')
                .sorted((x, y) -> x.getAge() - y.getAge())
                .forEach(System.out::println);

        // Работа метод chaining в stream:
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,1,2,3);
        stream1.filter(el->{ // intermediate метод - эти методы не срабатывают без terminal методов
            System.out.println("!!!");
            return el%2==0;
        }).collect(Collectors.toList()); // terminal метод - без него не сработает метод filter()
    }
}