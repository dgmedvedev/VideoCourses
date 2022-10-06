package VideoCourse_01.Homework.Lesson05;

public class Employee {
    Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;

    void doubleSalary() {
        this.salary *= 2;
    }
}

class EmployeeTest {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Freeman", 50, 15000, "FBI");
        Employee e2 = new Employee(2, "Jameson", 30, 5000, "Dep");

        System.out.println("Зарплата " + e1.surname + " до повышения = " + e1.salary);
        System.out.println("Зарплата " + e2.surname + " до повышения = " + e2.salary);

        e1.doubleSalary();
        e2.doubleSalary();

        System.out.println("Зарплата " + e1.surname + " = " + e1.salary);
        System.out.println("Зарплата " + e2.surname + " = " + e2.salary);
    }
}