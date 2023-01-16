package videoCourse_03.homework.lesson23;

public class Driver extends Employee implements DrivingAble {
    Driver(String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.println(getName() + " водит");
    }
}