package videoCourse_02.lessons.lesson05_lambda.function;

import videoCourse_02.lessons.lesson05_lambda.Student;

import java.util.ArrayList;
import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
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

        double res = avgOfSomething(students, student -> student.getAvgGrade());
        double avgCourse = avgOfSomething(students, student -> (double)student.getCourse());

        System.out.println(res);
        System.out.println(avgCourse);

    }

    public static double avgOfSomething(ArrayList<Student> list, Function<Student, Double> function){
        double result = 0;
        for(Student student : list){
            result += function.apply(student);
        }
        result = result / list.size();
        return result;
    }
}