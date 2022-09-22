package VideoCourse_01.Lessons.Lesson21_repeat;

public class Test4 {
    public static void main(String[] args) {
        Employee e = new Employee();            // вылетит StackOverflowError
    }
}

class Employee{
    Employee manager = new Employee();          // рекурсия. бесконечно создается manager
}