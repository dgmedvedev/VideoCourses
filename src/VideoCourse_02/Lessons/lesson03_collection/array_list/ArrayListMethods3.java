package VideoCourse_02.Lessons.lesson03_collection.array_list;

import java.util.Arrays;
import java.util.List;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder[] array = {sb1, sb2, sb3, sb4};
        List<StringBuilder> list = Arrays.asList(array); // связан с array, не может изменить длину и все изменения array отобразятся в list
        System.out.println(list);
        array[0].append("!!!");
        System.out.println(list);
        array[0] = new StringBuilder("F");
        System.out.println(list);
        // list.remove(0); //- вылетит UnsupportedOperationException (Runtime Exception) т.к. list не может изменить длину
    }
}