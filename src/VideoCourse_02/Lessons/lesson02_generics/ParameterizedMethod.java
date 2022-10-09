package VideoCourse_02.Lessons.lesson02_generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        int i = GenMethod.getSecondElement(al1);
        System.out.println("Integer i = " + i);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("10");
        al2.add("20");
        al2.add("30");
        String s = GenMethod.getSecondElement(al2);
        System.out.println("String s = " + s);
    }
}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    } // не обязательно static
}