package videoCourse_01.lessons.lesson15;

public class Test1 {
    public static void main(String[] args) {
        int a = 5;

        while (a++<10){
            a++;
        }
        System.out.println("a = " + a); // a = 12

        a = 5;

        while (++a<10){
            a++;
        }
        System.out.println("a = " + a); // a = 10;
    }
}