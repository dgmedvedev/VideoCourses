package videoCourse_02.lessons.lesson08_work_with_files.txtExample;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String string = "Example!\n";
        String rubai = """
                Много лет размышлял я над жизнью земной.
                Непонятного нет для меня под луной.
                Мне известно, что мне ничего не известно!
                Вот последняя правда, открытая мной.""";
        FileWriter writer = null; // объявляем здесь переменную, чтобы она была видна в блоке finally
        try {
            writer = new FileWriter("testFile.txt", true); // - без true, файл будет перезаписываться
            System.out.println("1-ый вариант записи в файл");
            writer.write(string);
            System.out.println("2-ой вариант записи в файл");
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }
    }
}