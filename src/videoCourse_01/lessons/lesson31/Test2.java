package videoCourse_01.lessons.lesson31;

import java.util.ArrayList;

public class Test2 {

    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(30);
        al1.add(150);
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("a");
        al2.add("b");
        al2.add("c");
        int i = GenMethod.getSecondElement(al1);
        String s = GenMethod.getSecondElement(al2);
        System.out.println(i);
        System.out.println(s);
    }
}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }
}