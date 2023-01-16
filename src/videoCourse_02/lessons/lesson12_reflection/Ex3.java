package videoCourse_02.lessons.lesson12_reflection;

import java.lang.reflect.Field;

public class Ex3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(10, "Dima", "IT");
        Class employeeClass = employee.getClass();
        Field field = employeeClass.getDeclaredField("salary");
        // рефлексия нарушает правило инкапсуляции
        field.setAccessible(true); // с помощью этого метода можно получить доступ к private полю
        double salaryValue = (Double) field.get(employee); // прочитали private поле
        System.out.println(salaryValue);

        field.set(employee,1500); // - изменили private поле
        System.out.println(employee);

    }
}