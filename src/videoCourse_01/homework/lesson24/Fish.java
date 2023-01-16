package videoCourse_01.homework.lesson24;

public abstract class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }
    public void sleep() {
        System.out.println("It's always interesting to watch how fish sleep");
    }
    public abstract void swim();
}