package videoCourse_03.homework.lesson23;

public class Cooker extends Employee implements CookAble {
    Cooker(String name) {
        super(name);
    }

    @Override
    public void cook() {
        System.out.println(getName() + " готовит");
    }
}