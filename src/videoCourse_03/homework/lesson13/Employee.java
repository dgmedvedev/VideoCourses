package videoCourse_03.homework.lesson13;

public class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;

    }

    String getInfo(int month) {
        return "Сотрудник " + name + ", отдел " + department +
                ", за последние " + month + " месяцев получил " + month * salary + " рублей.";
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Ivan", "IT",3000);
        System.out.println(employee.getInfo(6));
        System.out.println(employee.getInfo(10));
    }
}