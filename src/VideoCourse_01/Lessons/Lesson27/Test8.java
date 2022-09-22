package VideoCourse_01.Lessons.Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test8 {
    static int abc() {
        try {
            File file = new File("testFile1.txt");
            FileInputStream fis = new FileInputStream(file);
            return 1;
        } catch (FileNotFoundException e) {
            System.out.println("Exception");
            return -1;
        } finally { // если в finally блоке будет return, то метод abc() вернет именно return finally блока в любом случае
            System.out.println("finally block");
        }
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}