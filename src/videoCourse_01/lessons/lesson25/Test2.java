package videoCourse_01.lessons.lesson25;

public class Test2 {
    public static void main(String[] args) {
        Employee e = new Employee();
        // Employee d = (Doctor) new Employee();        - ClassCastException
        e.sleep();
    }
}

class Employee{
    void sleep(){
        System.out.println("Employee sleeps");
    }
}

class Doctor extends Employee{
    void sleep(){
        System.out.println("Doctor sleeps");
    }
}
