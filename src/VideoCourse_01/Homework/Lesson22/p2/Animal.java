package VideoCourse_01.Homework.Lesson22.p2;

public class Animal {
    public Animal() {
        System.out.println("I am animal");
    }

    private int eyes;

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getEyes() {
        return eyes;
    }

    public void eat() {
        System.out.println("Animal eats");
    }

    public void drink() {
        System.out.println("Animal drinks");
    }
}