package videoCourse_01.lessons.lesson29.part_2.SupplierAndConsumer;

public class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public String toString() {
        return "Our Car is " + model + ", color is " + color + " and engine = " + engine;
    }
}