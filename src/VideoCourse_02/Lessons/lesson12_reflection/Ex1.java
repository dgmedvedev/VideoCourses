package VideoCourse_02.Lessons.lesson12_reflection;

import java.lang.reflect.Field;

public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        // 1-ый вариант создания класса Class
        Class employeeClass = Class.forName("VideoCourse_02.Lessons.lesson12_reflection.Employee");

        // 2-ой и 3-ий варианты создания класса Class
//        Class employeeClass2 = Employee.class;
//        Employee emp = new Employee();
//        Class employeeClass3 = emp.getClass();

        Field someFiled = employeeClass.getField("id");
        System.out.println("Type of id field = " + someFiled.getType());
    }
}