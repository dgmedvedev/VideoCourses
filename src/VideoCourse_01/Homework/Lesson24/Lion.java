package VideoCourse_01.Homework.Lesson24;

public class Lion extends Mammal{
    public Lion(String name){
        super(name);
    }
    public void eat(){
        System.out.println("Lion likes to eat meat");
    }
    public void sleep(){
        System.out.println("The lion sleeps most of the day");
    }
    public void run(){
        System.out.println("A lion is not the fastest cat");
    }
}