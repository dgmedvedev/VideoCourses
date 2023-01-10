package VideoCourse_03.Homework.lesson15;

public class Box {
    private double width;
    private double height;
    private double length;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }


    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(Box box1, Box box2) {
        this.width = box1.width + box2.width;
        this.height = box1.height + box2.height;
        this.length = box1.length + box2.length;
    }

    public double volume() {
        return width * height * length;
    }

    public Box concatBox(Box box) {
        return new Box(width + box.width, height + box.height, length + box.length);
    }
}

class BoxTest {
    public static void main(String[] args) {
        Box box1 = new Box(5, 5, 5);
        Box box2 = new Box(10, 10, 10);
        Box box3 = box1.concatBox(box2);
        Box box4 = new Box(box2, box3);

        System.out.println(box1.volume());
        System.out.println(box2.volume());
        System.out.println(box3.volume());
        System.out.println(box4.volume());
        System.out.println("--------");
        System.out.println(box1.getWidth());
        System.out.println(box2.getHeight());
        System.out.println(box3.getLength());
        box1.setWidth(3);
        box2.setHeight(4);
        box3.setLength(5);
    }
}