package videoCourse_03.homework.lesson02;

import java.util.ArrayList;
import java.util.List;

public class MyFamilyNames {
    public static void main(String[] args) {
        List<String> listNames = new ArrayList<>(5);
        listNames.add("Dima");
        listNames.add("Oksana");
        listNames.add("Maks");
        listNames.add("Den");

        for (String s : listNames) {
            System.out.println(s);
        }
    }
}