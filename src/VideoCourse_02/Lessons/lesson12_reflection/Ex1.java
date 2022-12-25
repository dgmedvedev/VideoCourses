package VideoCourse_02.Lessons.lesson12_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        // 1-ый вариант создания класса Class
        Class employeeClass = Class.forName("VideoCourse_02.Lessons.lesson12_reflection.Employee");

        // 2-ой и 3-ий варианты создания класса Class
//        Class employeeClass2 = Employee.class;
//        Employee emp = new Employee();
//        Class employeeClass3 = emp.getClass();

        // Работа с полями
        Field someFiled = employeeClass.getField("id");
        System.out.println("Type of id field = " + someFiled.getType());
        System.out.println("-------------------------------------");

        Field[] fields = employeeClass.getFields(); // возвращает поля класса, кроме private
        for (Field field : fields) {
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }
        System.out.println("-------------------------------------");

        Field[] allFields = employeeClass.getDeclaredFields(); // возвращает все поля класса, в том числе и private
        for (Field field : allFields) {
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }
        System.out.println("-------------------------------------");

        // Работа с методами
        Method someMethod1 = employeeClass.getMethod("increaseSalary");
        System.out.println("Return type of method increaseSalary = " + someMethod1.getReturnType() +
                ", parameter types = " + Arrays.toString(someMethod1.getParameterTypes()));
        System.out.println("-------------------------------------");

        Method someMethod2 = employeeClass.getMethod("setSalary", double.class);
        System.out.println("Return type of method setSalary = " + someMethod2.getReturnType() +
                ", parameter types = " + Arrays.toString(someMethod2.getParameterTypes()));
        System.out.println("-------------------------------------");

        Method[] methods = employeeClass.getMethods(); // возвращает все методы класса, даже унаследованные
        for (Method method : methods) {
            System.out.println("Name of method = " + method.getName() + " return type = " + method.getReturnType() +
                    ", parameter types = " + Arrays.toString(method.getParameterTypes()));
        }
        System.out.println("-------------------------------------");

        Method[] allMethods = employeeClass.getDeclaredMethods(); // возвращает только методы класса и private методы
        for (Method method : allMethods) {
            System.out.println("Name of method = " + method.getName() + " return type = " + method.getReturnType() +
                    ", parameter types = " + Arrays.toString(method.getParameterTypes()));
        }
        System.out.println("-------------------------------------");

        Method[] allMethods2 = employeeClass.getDeclaredMethods(); // возвращает только методы класса и private методы
        for (Method method : allMethods2) {
            if (Modifier.isPublic(method.getModifiers()))
                System.out.println("Name of method = " + method.getName() + " return type = " + method.getReturnType() +
                        ", parameter types = " + Arrays.toString(method.getParameterTypes()));
        }
        System.out.println("-------------------------------------");

        // Работа с конструкторами
        Constructor constructor1 = employeeClass.getConstructor(); // возвращает конструктор без параметров
        System.out.println("Constructor has " + constructor1.getParameterCount() +
                " parameters, their types are: " + Arrays.toString(constructor1.getParameterTypes()));
        System.out.println("-------------------------------------");

        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class); // возвращает конструктор без параметров
        System.out.println("Constructor has " + constructor2.getParameterCount() +
                " parameters, their types are: " + Arrays.toString(constructor2.getParameterTypes()));
        System.out.println("-------------------------------------");

        Constructor[] constructors = employeeClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("Constructor " + constructor.getName() +
                    " has " + constructor.getParameterCount() +
                    " parameters, their types are: " + Arrays.toString(constructor.getParameterTypes()));
        }
    }
}