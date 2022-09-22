package VideoCourse_01.Lessons.Lesson16;

public class Test6 {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "Urrrraaaaa!!!";
        String s3 = s1.concat(s2).trim().replace("Urrrraaaaa!!!", "УРА!!!").substring(6, 10);
        System.out.println("s3 = " + s3);
        System.out.println(s1.substring(s1.indexOf('W')));
    }
}
