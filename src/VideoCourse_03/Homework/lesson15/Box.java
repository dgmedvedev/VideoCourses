package VideoCourse_03.Homework.lesson15;

public class Box {
    private final double WIDTH;
    private final double HEIGHT;
    private final double LENGTH;

    public double getWIDTH() {
        return WIDTH;
    }

    public Box(double WIDTH, double HEIGHT, double LENGTH) {
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
        this.LENGTH = LENGTH;
    }

    public Box(Box box1, Box box2) {
        this.WIDTH = box1.WIDTH + box2.WIDTH;
        this.HEIGHT = box1.HEIGHT + box2.HEIGHT;
        this.LENGTH = box1.LENGTH + box2.LENGTH;
    }

    public double volume() {
        return WIDTH * HEIGHT * LENGTH;
    }

    public Box concatBox(Box box) {
        return new Box(WIDTH + box.WIDTH, HEIGHT + box.HEIGHT, LENGTH + box.LENGTH);
    }
}

class BoxTest {
    public static void main(String[] args) {
        Box box1 = new Box(5, 5, 5);
        Box box2 = new Box(10, 10, 10);
        Box box3 = box1.concatBox(box2);
        Box box4 = new Box(box2, box3);

        System.out.println(box1.getWIDTH());
        System.out.println(box2.getWIDTH());
        System.out.println(box3.getWIDTH());
        System.out.println(box4.getWIDTH());
        System.out.println("--------");
        System.out.println(box1.volume());
        System.out.println(box2.volume());
        System.out.println(box3.volume());
        System.out.println(box4.volume());
    }
}