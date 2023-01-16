package videoCourse_01.homework.lesson24;

public abstract class Bird extends Animal implements Speakable{
    private String name;
    public Bird(String name){
        super(name);
        this.name = name;
    }
    abstract void fly();
    public void speak(){
        System.out.println(name + " sings");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}