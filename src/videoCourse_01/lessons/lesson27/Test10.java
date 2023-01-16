package videoCourse_01.lessons.lesson27;

public class Test10 {
    public static void main(String[] args) throws Exception{
        Exception e = null;
        throw e;    // вылетит NullPointerException, т.к. перебросить null нельзя
    }
}