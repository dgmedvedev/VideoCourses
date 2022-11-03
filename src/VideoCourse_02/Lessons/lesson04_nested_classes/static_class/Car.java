package VideoCourse_02.Lessons.lesson04_nested_classes.static_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int countOfCars;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
        countOfCars++;
    }

    void method() {
        System.out.println(Engine.countOfEngines);

        Engine e = new Engine(90);
        System.out.println(e.powerHorse);
    }

    @Override
    public String toString() {
        return "My Car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    static class Engine {
        private final int powerHorse;
        static int countOfEngines;

        public Engine(int powerHorse) {
            System.out.println(countOfCars);
            // System.out.println(doorCount); - ошибка, т.к. doorCount non-static
            this.powerHorse = powerHorse;
            countOfEngines++;
        }

        @Override
        public String toString() {
            return "My Engine: {" +
                    "powerHorse=" + powerHorse +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine);

        Car car = new Car("red", 2, engine);
        System.out.println(car);
        car.method();
    }
}