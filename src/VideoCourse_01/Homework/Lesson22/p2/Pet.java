package VideoCourse_01.Homework.Lesson22.p2;

public class Pet extends Animal {
    private String name;
    private int tail = 1;
    private int paw = 4;

    Pet() {
        System.out.println("I am pet");
        setEyes(2);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getTail() {
        return tail;
    }

    public void setPaw(int paw) {
        this.paw = paw;
    }

    public int getPaw() {
        return paw;
    }

    public void run() {
        System.out.println("Pet runs");
    }

    public void jump() {
        System.out.println("Pet jumps");
    }
}