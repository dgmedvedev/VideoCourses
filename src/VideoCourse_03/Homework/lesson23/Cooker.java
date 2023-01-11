package VideoCourse_03.Homework.lesson23;

public class Cooker extends Employee implements CookingAble {
    Cooker(String name) {
        super(name);
    }

    @Override
    public void cook() {
        System.out.println(getName() + " готовит");
    }
}