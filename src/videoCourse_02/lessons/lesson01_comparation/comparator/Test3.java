package videoCourse_02.lessons.lesson01_comparation.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Andrey", "Andreev", 10000);
        Employee emp2 = new Employee(15, "Andrey", "Ivanov", 800);
        Employee emp3 = new Employee(123, "Ivan", "Petrov", 1500);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sort \n" + list);
        Collections.sort(list, new IdComparator());
        System.out.println("After sort  IdComparator\n" + list);
        Collections.sort(list, new SalaryComparator());
        System.out.println("After sort  SalaryComparator\n" + list);
        Collections.sort(list, new NameSurnameComparator());
        System.out.println("After sort  NameSurnameComparator\n" + list);
    }
}

class Employee {
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
}

class IdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        if (emp1.id == emp2.id) {
            return 0;
        } else if (emp1.id < emp2.id) {
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

class NameSurnameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        int res = emp1.name.compareTo(emp2.name);
        if (res == 0) {
            res = emp1.surname.compareTo(emp2.surname);
        }
        return res;
    }
}