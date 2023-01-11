package VideoCourse_03.Lessons.lesson24;

import VideoCourse_03.Homework.lesson23.CookAble;

public class Director {
    public void force(CookAble cookable) {
        cookable.cook();
    }
}

class DirectorTest {
    public static void main(String[] args) {
        Director director = new Director();
        director.force(new CookAble() {
            @Override
            public void cook() {
                System.out.println("Готовлю");
            }
        });
    }
}