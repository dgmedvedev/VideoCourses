package videoCourse_01.homework.lesson24;

public class Shark extends Fish{
    public Shark(String name){
        super(name);
    }
    public void swim(){
        System.out.println("The shark swims fast!");
    }
    public void eat() {
        System.out.println("Shark eats meat and other fish");
    }
}