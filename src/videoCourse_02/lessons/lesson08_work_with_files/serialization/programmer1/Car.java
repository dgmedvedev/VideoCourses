package videoCourse_02.lessons.lesson08_work_with_files.serialization.programmer1;

import java.io.Serializable;

public class Car implements Serializable {
    static final long serialVersionUID = 1; // значение вручную изменяется при будущих изменениях данного класса
    String model;
    String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}