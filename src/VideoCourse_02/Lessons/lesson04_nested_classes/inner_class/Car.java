package VideoCourse_02.Lessons.lesson04_nested_classes.inner_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount, int powerHorse) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = this.new Engine(powerHorse);
    }

    @Override
    public String toString() {
        return "My Car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine {
        private final int powerHorse;

        public Engine(int powerHorse) {
            System.out.println(doorCount);//inner класс видит переменные внешнего класса (даже private, final и static)
            this.powerHorse = powerHorse;
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
        // Car.Engine engine = new Car.Engine(256); - только для static
        Car car = new Car("black", 4, 300);
        System.out.println(car);

        Car.Engine otherEngine = car.new Engine(150); // создан отдельный объект Engine
        System.out.println(otherEngine);

        System.out.println(car);
    }
}