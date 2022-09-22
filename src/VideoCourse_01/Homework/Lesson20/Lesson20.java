package VideoCourse_01.Homework.Lesson20;

import java.util.ArrayList;
import java.util.Collections;

public class Lesson20 {
    static ArrayList<String> abc(String... strings) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (String str : strings) {
            if (!stringArrayList.contains(str)) {
                stringArrayList.add(str);
            }
        }
        Collections.sort(stringArrayList);
        return stringArrayList;
    }

    public static void main(String[] args) {
        System.out.println(abc("1","-2", "6", "0", "1", "B","A","B","5"));
    }
}