package videoCourse_01.lessons.lesson27;

import java.io.IOException;

public class Test19 {
    public static void main(String[] args) {
        Animals an = new Mouse();
        try {
            an.run();                       // обработка ошибок проверяется compile time binding
        } catch (IOException e) {
            System.out.println("Exception");
        }
    }
}

class Animals {
    void run() throws IOException {
        System.out.println("Animal runs");
    }
}

class Mouse extends Animals {
    //void run() throws Exception{ - в Override методе нельзя пробросить ошибку более высокого уровня чем в super классе
    // но можно бросать любые RuntimeException
    void run() throws ArrayIndexOutOfBoundsException, NullPointerException {
        System.out.println("Mouse runs");
    }
}

class Human {
    String name;
    int age;

    Human(String name, int age) throws Exception {
        if (age < 0) {
            throw new Exception("age < 0");
        }
        this.name = name;
        this.age = age;
    }
}