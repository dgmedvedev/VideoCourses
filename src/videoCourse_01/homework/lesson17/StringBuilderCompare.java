package videoCourse_01.homework.lesson17;

import videoCourse_01.homework.lesson15.Time;

public class StringBuilderCompare {
    static boolean compare(StringBuilder sb1, StringBuilder sb2) {
        String s1 = sb1.substring(0, sb1.length());
        String s2 = sb2.substring(0, sb2.length());
        return s1.equals(s2);
    }
}

class StringBuilderCompareTest {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder("Hello World");
        StringBuilder sb4 = new StringBuilder("Hello ");
        StringBuilder sb5 = new StringBuilder("World");
        Time time = new Time();
        sb4.append(sb5);
        System.out.println(StringBuilderCompare.compare(sb1, sb2));
        System.out.println(StringBuilderCompare.compare(sb3, sb4));
        sb3.append(time);
        sb4.append(time);
        System.out.println(StringBuilderCompare.compare(sb3, sb4));
    }
}
