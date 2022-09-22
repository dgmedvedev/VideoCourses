package VideoCourse_01.Lessons.Lesson23;

public class Employee {
    String name;

    void eat() {
    }
}

class Teacher extends Employee {
    @Override
    void eat() {
        System.out.println("Override");
    }
}

class A {
    Employee objectCreation() {
        return new Employee();
    }
}

class B extends A {
    @Override
    Teacher objectCreation() {
        System.out.println("Override");
        return new Teacher();
    }
}