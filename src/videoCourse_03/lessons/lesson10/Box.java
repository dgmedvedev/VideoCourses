package videoCourse_03.lessons.lesson10;

public class Box {
    double width;
    double height;
    double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    void showVolume() {
        System.out.println(width * height * length);
    }
}

class BoxTest {
    public static void main(String[] args) {
        Box box1 = new Box(10.2, 15, 11.3);
        Box box2 = new Box(5, 5, 5);
        Box box3 = new Box(10, 10, 10);

        box1.showVolume();
        box2.showVolume();
        box3.showVolume();
    }
}