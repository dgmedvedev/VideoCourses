package VideoCourse_01.Homework.Lesson29;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Lesson29 {
    public static void main(String[] args) {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee.add(new Employee("Ivan", "IT", 1000));
        listEmployee.add(new Employee("IT", "IT", 500));
        listEmployee.add(new Employee("Petr", "FBI", 800.9));
        listEmployee.add(new Employee("Elena", "Medical", 600));

        EmployeeTest et = new EmployeeTest();
        et.filterEmployee(listEmployee, e -> e.department.equals("IT") && e.salary > 200);
        System.out.println("---------------------------------------------");
        et.filterEmployee(listEmployee, e -> e.name.startsWith("E") && e.salary != 450);
        System.out.println("---------------------------------------------");
        et.filterEmployee(listEmployee, e -> e.name.equals(e.department));
    }
}

class Employee {
    String name;
    String department;
    double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class EmployeeTest {
    void printEmployee(Employee e) {
        System.out.println("Name: " + e.name + ", department: " + e.department + ", salary: " + e.salary);
    }

    void filterEmployee(ArrayList<Employee> list, Predicate<Employee> p) {
        for (Employee e : list) {
            if (p.test(e)) {
                printEmployee(e);
            }
        }
    }
}