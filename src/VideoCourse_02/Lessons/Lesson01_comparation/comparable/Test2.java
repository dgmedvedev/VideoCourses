package VideoCourse_02.Lessons.Lesson01_comparation.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
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
        System.out.println("After sort \n" + list);
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
        return this.id - anotherEmployee.id;        // используется чаще всего при работе с int

//      2-ой способ. Используется чаще всего со String
//  public int compareTo(Employee anotherEmployee) {
//      return this.name.compareTo(anotherEmployee.name);
//  }

//      3-ий способ (естественный порядок):
//        if (this.id == anotherEmployee.id) {
//            return 0;
//        } else if (this.id < anotherEmployee.id) {
//            return -1;
//        } else {
//            return 1;
//        }

//      4-ый способ. Если имена равны, сравнивают фамилии
//        int res = this.name.compareTo(anotherEmployee.name);
//        if(res == 0){
//            res = this.surname.compareTo(anotherEmployee.surname);
//        }
//        return res;

//      5-ый способ. Реже всего используется. Т.к. из int в Integer
//        return Integer.compare(this.id,anotherEmployee.id);
    }
}