package VideoCourse_01.Lessons.Lesson27;

public class Test16_2 {
    public static void main(String[] args) {
        Airbus airbus = new Airbus();
        airbus.waiting();
        //airbus.fly();
        airbus.cancelFlight();
        airbus.waiting();
    }
}

class Airbus {
    String condition = "waiting";

    public void fly() {
        condition = "flying";
        System.out.println("The airbus is flying");
    }

    public void waiting() {
        if (condition.equals("flying")) {
            throw new IllegalStateException("The airbus is already flying");
        }
        condition = "waiting";
        System.out.println("The airbus is waiting");
    }

    public void cancelFlight() {
        if (condition.equals("flying")) {
            throw new IllegalStateException("The airbus is already flying");
        }
        condition = "cancel flight";
        System.out.println("Airbus flight cancelled");
    }

}