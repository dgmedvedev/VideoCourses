package VideoCourse_02.Lessons.lesson01_comparation.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Dmitry", "Medvedev", 10000);
        Employee emp2 = new Employee(15, "Andrey", "Ivanov", 800);
        Employee emp3 = new Employee(123, "Ivan", "Petrov", 1500);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sort \n" + list);
        Collections.sort(list);
        System.out.println("After sort Comparable\n" + list);
        Collections.sort(list, new SalaryComparator());
        System.out.println("After sort SalaryComparator\n" + list);
        Collections.sort(list, new NameComparator());
        System.out.println("After sort NameComparator\n" + list);
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmployee) {
        if (this.salary == anotherEmployee.salary) {
            return 0;
        } else if (this.salary < anotherEmployee.salary) {
            return -1;
        } else {
            return 1;
        }
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary - emp2.salary;
    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}