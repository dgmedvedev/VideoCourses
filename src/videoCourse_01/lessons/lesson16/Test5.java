package videoCourse_01.lessons.lesson16;

public class Test5 {
    public static void main(String[] args) {
        String s1 = null;   // - null имеет тип String, т.е. "null"
        s1 += "ok";
        System.out.println(s1);
        System.out.println(null + "ok");
        System.out.println(true + "ok");
        // System.out.println(null + true + "ok");    - ошибка!!!

        String s2 = null;
        boolean b = true;
        System.out.println(s2 + b);
        //System.out.println(null + true);    - ошибка!!!
    }
}
