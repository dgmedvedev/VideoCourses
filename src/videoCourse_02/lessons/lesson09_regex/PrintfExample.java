package videoCourse_02.lessons.lesson09_regex;

public class PrintfExample {

    static void employeeInfo(Employee emp) {
        System.out.printf("%03d \t %-12s \t %-12s \t %,.1f \n",
                emp.id, emp.name, emp.surname, emp.salary * (1 + emp.bonusPercent));
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Dima", "Ivanov", 1234, 0.15);
        Employee emp2 = new Employee(15, "Ivan", "Petrov", 555, 0.08);
        Employee emp3 = new Employee(123, "Mariya", "Sidorova", 777, 0.12);

        employeeInfo(emp1);
        employeeInfo(emp2);
        employeeInfo(emp3);

        System.out.println("--------------------------------------------------");

        String newString = String.format("%03d \t %-12s \t %-12s \t %,.1f \n",
                33, "Pert", "Ivanov", 888 * (1 + 0.1));
        System.out.println(newString);
    }
}

class Employee {
    int id;
    String name;
    String surname;
    int salary;
    double bonusPercent;

    public Employee(int id, String name, String surname, int salary, double bonusPercent) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonusPercent = bonusPercent;
    }
}