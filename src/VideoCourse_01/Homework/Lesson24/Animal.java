package VideoCourse_01.Homework.Lesson24;

public abstract class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    public abstract void eat();
    public abstract void sleep();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}