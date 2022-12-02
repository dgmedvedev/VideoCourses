package VideoCourse_02.Lessons.lesson08_work_with_files;

import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesReader {
    public static void main(String[] args) throws IOException {
        // в скобках указывается ресурс, который необходимо закрыть по завершению программы
        try (FileReader reader = new FileReader("testFile.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}