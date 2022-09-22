package VideoCourse_01.Homework.Lesson24;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }
    public void eat() {
        System.out.println("The penguin likes to eat fish");
    }
    public void sleep() {
        System.out.println("Penguins sleep snuggled up to each other");
    }
    public void fly() {
        System.out.println("Penguins can't fly");
    }
    public void speak() {
        System.out.println("Penguins can't sing like nightingales");
    }
}