package videoCourse_01.homework.lesson24;

public class Test {
    public static void main(String[] args) {
        Shark shark = new Shark("Zubastik");
        System.out.println("Shark name: " + shark.getName());
        shark.eat();
        shark.swim();
        shark.sleep();

        Fish shark1 = new Shark("Zubastik1");
        System.out.println("Shark name: " + shark1.getName());
        Fish shark2 = new Shark("Zubastik2");
        System.out.println("Shark name: " + shark2.getName());

        Speakable penguin = new Penguin("Pen");
        penguin.speak();

        Animal lion = new Lion("Leo");
        System.out.println("Lion name: " + lion.getName());
        lion.eat();
        lion.sleep();

        Mammal lionJr = new Lion("Simba");
        System.out.println("Lion Junior name: " + lionJr.getName());
        lionJr.eat();
        lionJr.sleep();
        lionJr.speak();
        lionJr.run();
    }
}