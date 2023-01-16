package videoCourse_01.homework.lesson22.p2;

public class Dog extends Pet {
    Dog(String name){
        setName(name);
        System.out.println("I am dog and my name is: " + getName());
    }

    public void play(){
        System.out.println("Dog plays");
    }
}