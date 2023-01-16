package videoCourse_03.lessons.lesson24;

import videoCourse_03.homework.lesson23.CookAble;

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