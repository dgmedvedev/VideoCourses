package VideoCourse_01.Lessons.Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test2 {
    public static void main(String[] args) {
        File file = new File("testFile.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            System.out.println("Good day!");
        } catch (FileNotFoundException e){
            System.out.println("catch Exception " + e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }

        System.out.println("print");
    }
}