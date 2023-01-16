package videoCourse_01.lessons.lesson26;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        Car c1 = new Car("red", "V4");
        Car c2 = new Car("red", "V4");
        Car c3 = new Car("black", "V8");
        System.out.println(c1.equals(c2));

        ArrayList<Car> listCar = new ArrayList<>();
        listCar.add(c1);
        listCar.add(c2);
        listCar.add(c3);
        Car c4 = new Car("black", "V8");
        System.out.println(listCar.contains(c4));       // true, т.к. метод equals переопределен в классе Car
        System.out.println(c1);
    }
}

class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car car = (Car)obj;
            return (color.equals(car.color)&&engine.equals(car.engine));
        } else {
            return false;
        }
    }

    public String toString(){
        return "Car color: " + color + "\nCar engine: " + engine;
    }
}