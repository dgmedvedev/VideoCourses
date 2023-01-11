package VideoCourse_03.Homework.lesson23;

import java.util.ArrayList;

public abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void setName(String name) {
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
        Cooker cooker1 = new Cooker("Ivan");
        Cooker cooker2 = new Cooker("Petr");
        Cooker cooker3 = new Cooker("Oleg");
        Driver driver1 = new Driver("Alex");
        Driver driver2 = new Driver("Sergey");
        Driver driver3 = new Driver("Nikita");
        Programmer programmer1 = new Programmer("Olga");
        Programmer programmer2 = new Programmer("Mariya");
        Programmer programmer3 = new Programmer("Sveta");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(cooker1);
        employees.add(cooker2);
        employees.add(cooker3);
        employees.add(driver1);
        employees.add(driver2);
        employees.add(driver3);
        employees.add(programmer1);
        employees.add(programmer2);
        employees.add(programmer3);

        ArrayList<CodeWritable> programmers = new ArrayList<>();
        programmers.add(programmer1);
        programmers.add(programmer2);
        programmers.add(programmer3);

        ArrayList<DrivingAble> drivers = new ArrayList<>();
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);

        ArrayList<CookingAble> cookers = new ArrayList<>();
        cookers.add(cooker1);
        cookers.add(cooker2);
        cookers.add(cooker3);

        for (Employee employee : employees) {
            employee.voice();
        }
        System.out.println("-------------");
        for (CookingAble cooker : cookers) {
            cooker.cook();
        }
        System.out.println("-------------");
        for (DrivingAble driver : drivers) {
            driver.drive();
        }
        System.out.println("-------------");
        for (CodeWritable programmer : programmers) {
            programmer.writingCode();
        }
    }
}