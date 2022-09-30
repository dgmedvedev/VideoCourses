package VideoCourse_01.Lessons.Lesson29.part_2.SupplierAndConsumer;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class CarTestSupplierAndConsumer {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(carSupplier.get());
        }
        return list;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) { // это то же самое, что и закомментированный код, но написано по другому
        // это 1-ая техника написания лямбда-выражений, которая чаще всего используется
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Polo", "gold", 1.6));
        System.out.println("Our cars: " + ourCars);

        changeCar(ourCars.get(0), car -> {  // это то же самое, что и закомментированный код, но написано по другому
            car.color = "red";
            car.engine = 1.8;
            System.out.println("Update car: " + car);
        });

//        Consumer<Car> carConsumer = car -> {
//            car.color = "red";
//            car.engine = 1.8;
//            System.out.println("Update car: " + car);
//        };
//        carConsumer.accept(ourCars.get(0));

        System.out.println("Our cars: " + ourCars);
    }
}