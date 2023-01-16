package videoCourse_01.lessons.lesson21_repeat;

public class Test4 {
    public static void main(String[] args) {
        Employee e = new Employee();            // вылетит StackOverflowError
    }
}

class Employee{
    Employee manager = new Employee();          // рекурсия. бесконечно создается manager
}