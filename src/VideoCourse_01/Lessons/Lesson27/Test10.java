package VideoCourse_01.Lessons.Lesson27;

public class Test10 {
    public static void main(String[] args) throws Exception{
        Exception e = null;
        throw e;    // вылетит NullPointerException, т.к. перебросить null нельзя
    }
}