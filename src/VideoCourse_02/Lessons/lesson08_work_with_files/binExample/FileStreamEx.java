package VideoCourse_02.Lessons.lesson08_work_with_files.binExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamEx {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("d:\\Multimedia\\Photo\\3.jpg");
             FileOutputStream outputStream = new FileOutputStream("3.jpg")) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}