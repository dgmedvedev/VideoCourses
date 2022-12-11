package VideoCourse_02.Lessons.lesson08_work_with_files.path_and_files;

import java.io.IOException;
import java.nio.file.*;

public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Path filePath = Paths.get("test15.txt");
        Path filePath13 = Paths.get("test13.txt");
        Path directoryPath = Paths.get("C:\\Java\\M");
        Path directoryBPath = Paths.get("C:\\Java\\B");


        // если при копировании совпадут имена файлов в папке, то вылетит Exception
        // Files.copy(filePath, directoryPath.resolve(filePath)); // - копируем с именем filePath, т.е. test15.txt
        // чтобы избежать ошибки с совпадением имени файла, необходимо использовать дополнительный параметр
        Files.copy(filePath, directoryPath.resolve(filePath),
                StandardCopyOption.REPLACE_EXISTING); // - копируем и перезаписываем (если есть) test15.txt
        Files.copy(filePath, directoryPath.resolve("test16.txt"),
                StandardCopyOption.REPLACE_EXISTING); // - копируем, переименовываем в test16.txt и перезаписываем
        // с помощью метода copy(), копируется только папка, но БЕЗ содержимого)
        Files.copy(directoryBPath, directoryPath.resolve("B"),
                StandardCopyOption.REPLACE_EXISTING);
        // Files.move(filePath, Paths.get("test11.txt")); - таким способом можно переименовать файл в той же папке

        Files.createFile(filePath13);
        System.out.println("filePath13 is created");
        Files.delete(filePath13);
        System.out.println("filePath13 is deleted");

        // НЕ пустую папку с помощью метода delete() удалить невозможно, вылетит DirectoryNotEmptyException

        System.out.println("Done!");
    }
}