package videoCourse_02.lessons.lesson08_work_with_files.serialization.programmer1;

import java.io.Serializable;

public class Employee implements Serializable {
    static final long serialVersionUID = 1; // значение вручную изменяется при будущих изменениях данного класса
    String name;
    String department;
    int age;
    transient double salary; // значение переменной не будет сериализоваться (запишется default значение = 0.0)
    Car car; // тоже должен имплементировать класс Serializable, иначе java.io.NotSerializableException

    public Employee(String name, String department, int age, double salary, Car car) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }
}