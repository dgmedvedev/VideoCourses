package VideoCourse_02.Lessons.lesson13_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary() {
        salary *= 2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

@Target({ElementType.TYPE, ElementType.METHOD})
// - аннотация @Target указывает область кода, в которой может быть применима MyAnnotation
@Retention(RetentionPolicy.RUNTIME) // только со значением RUNTIME можно использовать рефлексию для аннотации
// - @Retention описывает жизненный цикл аннотации, т.е. до какого этапа программы будет видна MyAnnotation
@interface MyAnnotation {
    String title();

    int count();
}