package VideoCourse_01.Homework.Lesson22.p2;

public class Cat extends Pet {
    Cat(String name) {
        setName(name);
        System.out.println("I am cat and my name is: " + getName());
    }

    public void sleep() {
        System.out.println("Cat sleeps");
    }
}