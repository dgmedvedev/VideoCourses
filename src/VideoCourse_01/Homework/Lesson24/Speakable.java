package VideoCourse_01.Homework.Lesson24;

public interface Speakable {
    default void speak(){
        System.out.println("Somebody speaks");
    }
}