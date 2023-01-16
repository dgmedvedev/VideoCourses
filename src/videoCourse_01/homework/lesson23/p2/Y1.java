package videoCourse_01.homework.lesson23.p2;

import videoCourse_01.homework.lesson23.p1.X1;

public class Y1 extends X1 {
    Y1() {
    }
    @Override
    public void abc() {
        System.out.println('Y');
    }
    public static void main(String[] args) {
        Y1 y1 = new Y1();
        y1.abc();
    }
}