package videoCourse_03.homework.lesson21;

import videoCourse_03.homework.lesson15.Box;

public class BoxWeight extends Box {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(double width, double height, double length, double weight) {
        super(width, height, length);
        this.weight = weight;
    }

    public BoxWeight(BoxWeight box1, BoxWeight box2) {
        super(box1, box2);
        this.weight = box1.weight + box2.weight;
    }

    public BoxWeight concatBox(BoxWeight box) {
        return new BoxWeight(getWidth() + box.getWidth(),
                getHeight() + box.getHeight(),
                getLength() + box.getLength(),
                weight + box.weight);
    }
}

class BoxWeightTest {
    public static void main(String[] args) {
        BoxWeight box1 = new BoxWeight(5, 5, 5, 5);
        BoxWeight box2 = new BoxWeight(10, 10, 10, 10);
        BoxWeight box3 = box1.concatBox(box2);
        BoxWeight box4 = new BoxWeight(box1, box2);
        System.out.println(box3.getWeight());
        System.out.println(box4.getLength());
        box4.setWeight(9);

        System.out.println("Box3 volume = " + box3.volume());
        System.out.println("Box4 volume = " + box4.volume());
    }
}