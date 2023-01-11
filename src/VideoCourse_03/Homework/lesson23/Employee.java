package VideoCourse_03.Homework.lesson23;

import java.util.ArrayList;

public class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public final void voice() {
        System.out.println(name);
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Cook cook1 = new Cook("Ivan");
        Cook cook2 = new Cook("Petr");
        Cook cook3 = new Cook("Oleg");

        Driver driver1 = new Driver("Alex");
        Driver driver2 = new Driver("Sergey");
        Driver driver3 = new Driver("Nikita");

        Programmer programmer1 = new Programmer("Olga");
        Programmer programmer2 = new Programmer("Mariya");
        Programmer programmer3 = new Programmer("Sveta");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(cook1);
        employees.add(cook2);
        employees.add(cook3);
        employees.add(driver1);
        employees.add(driver2);
        employees.add(driver3);
        employees.add(programmer1);
        employees.add(programmer2);
        employees.add(programmer3);

        for (Employee employee : employees) {
            employee.voice();
        }
    }
}