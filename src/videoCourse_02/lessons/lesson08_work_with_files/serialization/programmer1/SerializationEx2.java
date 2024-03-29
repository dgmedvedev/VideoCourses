package videoCourse_02.lessons.lesson08_work_with_files.serialization.programmer1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Car car = new Car("VW Polo", "Gold");
        Employee employee = new Employee("Maria", "IT", 28, 500, car);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("employees2.bin")
        )) {
            outputStream.writeObject(employee);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}