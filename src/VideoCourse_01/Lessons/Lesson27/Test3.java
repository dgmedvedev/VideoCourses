package VideoCourse_01.Lessons.Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test3 {
    public static void main(String[] args) throws Exception {
        File file = new File("testFile.txt");
        FileInputStream fis = new FileInputStream(file);
        System.out.println("read " + fis.read());
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(100);
    }
}