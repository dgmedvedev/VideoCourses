package VideoCourse_03.Lessons.lesson10;

public class Box {
    double width;
    double height;
    double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
}

class BoxTest{
    public static void main(String[] args) {
        Box box1 = new Box(10.2, 15, 11.3);
        Box box2 = new Box(5, 5, 5);
        Box box3 = new Box(10, 10, 10);

        double volume1 = box1.width * box1.height * box1.length;
        double volume2 = box2.width * box2.height * box2.length;
        double volume3 = box2.width * box3.height * box3.length;

        System.out.println(volume1);
        System.out.println(volume2);
        System.out.println(volume3);
    }
}