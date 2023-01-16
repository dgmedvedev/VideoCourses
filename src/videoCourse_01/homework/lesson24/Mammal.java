package videoCourse_01.homework.lesson24;

public abstract class Mammal extends Animal implements Speakable{
    public Mammal(String name){
        super(name);
    }
    public abstract void run();
}