package VideoCourse_01.Homework.Lesson25;

import VideoCourse_01.Homework.Lesson24.*;

public class Lesson25 {
    public static void main(String[] args) {
        Speakable s1 = new Lion("Simba");
        Speakable s2 = new Penguin("Shkiper");
        Penguin s3 = new Penguin("Kovalski");
        Bird s4 = new Penguin("Prapor");
        Mammal s5 = new Lion("King");

        Animal a1 = new Lion("Leo");
        Animal a2 = new Penguin("Pen");
        Animal a3 = new Shark("Tiger Shark");
        Shark a4 = new Shark("Big White Shark");
        Bird a5 = new Penguin("Riko");
        Mammal a6 = new Lion("Big Cat");

        Speakable[] arraySpeakable = {s1, s2, s3, s4, s5};
        for (Speakable speakable : arraySpeakable) {
            if (speakable instanceof Lion) {
                System.out.println("I am Speakable Lion: " + ((Lion) speakable).getName());
                ((Lion) speakable).eat();
                ((Lion) speakable).sleep();
                ((Lion) speakable).run();
            }
            if (speakable instanceof Penguin) {
                System.out.println("I am Speakable Penguin: " + ((Penguin) speakable).getName());
                ((Penguin) speakable).eat();
                ((Penguin) speakable).sleep();
                ((Penguin) speakable).fly();
            }
            speakable.speak();
            System.out.println();
        }

        Animal[] arrayAnimals = {a1, a2, a3, a4, a5, a6};
        for (Animal animal : arrayAnimals) {
            System.out.println("My name is " + animal.getName());
            if (animal instanceof Lion) {
                System.out.println("I am Lion");
                ((Lion) animal).run();
                ((Lion) animal).speak();
            }
            if (animal instanceof Penguin) {
                System.out.println("I am Penguin");
                ((Penguin) animal).fly();
                ((Penguin) animal).speak();
            }
            if (animal instanceof Shark) {
                System.out.println("I am Shark");
                ((Shark) animal).swim();
            }
            animal.eat();
            animal.sleep();
            System.out.println();
        }
    }
}