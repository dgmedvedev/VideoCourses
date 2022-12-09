package VideoCourse_02.Lessons.lesson08_work_with_files.path_and_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndFilesEx1 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt"); // - просто создается путь, без файла
        Path directoryPath = Paths.get("C:\\Java\\M");

        System.out.println("filePath.getFileName() " + filePath.getFileName()); // - возвращает имя файла или директории
        System.out.println("directoryPath.getFileName() " + directoryPath.getFileName());
        System.out.println("-------------------------------------");

        System.out.println("filePath.getParent() " + filePath.getParent()); // - возвращает родителя файла или директории
        System.out.println("directoryPath.getParent() " + directoryPath.getParent());
        System.out.println("-------------------------------------");

        System.out.println("filePath.getRoot() " + filePath.getRoot()); // - возвращает корень файла или директории
        System.out.println("directoryPath.getRoot() " + directoryPath.getRoot());
        System.out.println("-------------------------------------");

        System.out.println("filePath.isAbsolute() " + filePath.isAbsolute()); // - является ли путь абсолютным
        System.out.println("directoryPath.isAbsolute() " + directoryPath.isAbsolute());
        System.out.println("-------------------------------------");

        System.out.println("filePath.toAbsolutePath() " + filePath.toAbsolutePath()); // - возвращает абсолютный путь
        System.out.println("directoryPath.toAbsolutePath() " + directoryPath.toAbsolutePath());
        System.out.println("-------------------------------------");

        System.out.println("filePath.toAbsolutePath().getParent() " +
                filePath.toAbsolutePath().getParent()); // - переводим в абсолютный путь и находим родителя, иначе null
        System.out.println("filePath.toAbsolutePath().getRoot() " +
                filePath.toAbsolutePath().getRoot()); // - переводим в абсолютный путь и находим корень, иначе null
        System.out.println("-------------------------------------");

        System.out.println("directoryPath.resolve(filePath) " + directoryPath.resolve(filePath));
        System.out.println("-------------------------------------");

        Path anotherPath = Paths.get("C:\\Java\\M\\N\\O\\test20.txt");
        System.out.println(directoryPath.relativize(anotherPath));

        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }
        if (!Files.exists(directoryPath)) {
            Files.createDirectory(directoryPath);
        }
    }
}