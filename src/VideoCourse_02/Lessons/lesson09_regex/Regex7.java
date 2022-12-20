package VideoCourse_02.Lessons.lesson09_regex;

public class Regex7 {
    public static void main(String[] args) {
        String s = "   Hello     my    friend!      How   are     you?";
        System.out.println(s);

        s = s.replace("you", "SQL");
        System.out.println(s);

        s = s.replaceAll(" {2,}", " ");
        System.out.println(s);

        s = s.replaceAll("\\ba\\w+", "11111");
        System.out.println(s);

        s = s.replaceFirst("\\bH\\w+", "FIRST");
        System.out.println(s);
    }
}