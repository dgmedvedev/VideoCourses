package VideoCourse_01.Lessons.Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test9{
    void abc() throws FileNotFoundException{
        try {
            File file = new File("testFile1.txt");
            FileInputStream fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("Exception nemnogo obrabotano");
            throw e;    // переброска Exception. требуется дальнейшая обработка
        } finally {
            System.out.println("finally block");
        }
    }
}
