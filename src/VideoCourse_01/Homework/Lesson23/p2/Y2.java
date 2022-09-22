package VideoCourse_01.Homework.Lesson23.p2;

import VideoCourse_01.Homework.Lesson23.p1.X2;

public class Y2 extends X2 {
    public void abc() {
        System.out.println('Y');
    }
    public void def() {
        Y2 y2 = new Y2();
        y2.abc();
    }
    public void ghi() {
        X2 x2 = new Y2();
        x2.abc();
    }
    public static void main(String[] args) {
        Y2 a = new Y2();
        a.abc();
        a.def();
        a.ghi();
    }
}