package VideoCourse_01.Homework.Lesson22.p2;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog");
        Cat cat = new Cat("Cat");

        System.out.println("У собаки " + dog.getName() + " " + dog.getPaw() + " лапы");
        System.out.println("У кота " + cat.getName() + " " + cat.getEyes() + " глаза");
        cat.sleep();
    }
}