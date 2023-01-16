package videoCourse_02.lessons.lesson12_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {
        Class employeeClass = Class.forName("videoCourse_02.lessons.lesson12_reflection.Employee");

//      Employee o = (Employee)employeeClass.newInstance(); - устаревший код. Использовался до Java 11

        Constructor<Employee> constructor1 = employeeClass.getConstructor();
        Employee obj1 = constructor1.newInstance(); // - создание объекта с помощью конструктора
        System.out.println(obj1);
        System.out.println("----------------------------------------------------------");

        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        Object obj2 = constructor2.newInstance(5, "Dima", "IT");
        System.out.println(obj2);

        Method method = employeeClass.getMethod("setSalary", double.class);
        method.invoke(obj2, 800.88); // - выполнение метода определенного объекта
        System.out.println(obj2);
    }
}