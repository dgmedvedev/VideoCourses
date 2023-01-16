package videoCourse_01.lessons.lesson20;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Ok");
        StringBuilder sb3 = new StringBuilder("Good");
        StringBuilder sb4 = sb1;                        // sb4 ссылается на тотже объект

        ArrayList<StringBuilder> listSb = new ArrayList<>();
        listSb.add(sb1);
        listSb.add(sb2);
        listSb.add(sb3);
        listSb.add(sb4);

        System.out.println(listSb);
        System.out.println();
        System.out.println(listSb.remove(sb4)); // 1-ое удаление объекта StringBuilder("Hello")     true
        System.out.println(listSb);
        System.out.println(listSb.remove(sb4)); // 2-ое удаление объекта StringBuilder("Hello")     true
        System.out.println(listSb);
        System.out.println(listSb.remove(sb4)); // 3-е удаление объекта StringBuilder("Hello")      false
        System.out.println();

        System.out.println(listSb);
    }
}

