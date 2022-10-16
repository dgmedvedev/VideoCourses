package VideoCourse_02.Lessons.lesson03_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        Employee emp1 = new Employee(15, "Sergey", 777);
        Employee emp2 = new Employee(21, "Andrey", 555);
        Employee emp3 = new Employee(9, "Nikolay", 1234);
        Employee emp4 = new Employee(15, "Ivan", 888);
        Employee emp5 = new Employee(2, "Alex", 789);
        Employee emp6 = new Employee(68, "Petr", 900);
        Employee emp7 = new Employee(39, "Mariya", 987);
        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        list.add(emp6);
        list.add(emp7);

        Collections.sort(list);
        int index1 = Collections.binarySearch(list, emp3);
        int index2 = Collections.binarySearch(list, new Employee(9, "Nikolay", 0));
        System.out.println(index1);
        System.out.println(index2);

        Collections.reverse(list); // переворачивает коллекцию
        System.out.println(list);
        Collections.shuffle(list); // перемешивает коллекцию
        System.out.println(list);

        int[] array = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index = Arrays.binarySearch(array, 150);
        System.out.println(index);
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.id - anotherEmp.id;
        if (result == 0) {
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
}