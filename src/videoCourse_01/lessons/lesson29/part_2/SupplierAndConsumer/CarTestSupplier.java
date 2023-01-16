package videoCourse_01.lessons.lesson29.part_2.SupplierAndConsumer;

import java.util.ArrayList;
import java.util.function.Supplier;

public class CarTestSupplier {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(carSupplier.get());
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Polo", "gold", 1.6));
        System.out.println("Our cars: " + ourCars);
    }
}