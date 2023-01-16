package videoCourse_02.lessons.lesson08_work_with_files.path_and_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

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

        System.out.println("directoryPath.resolve(filePath) " + directoryPath.resolve(filePath)); // - объединение путей
        System.out.println("-------------------------------------");

        Path anotherPath = Paths.get("C:\\Java\\M\\N\\O\\test20.txt");
        System.out.println(directoryPath.relativize(anotherPath)); // - возвращает разность путей (aPath-dPath)

        if (!Files.exists(filePath)) { // - проверяет, существует ли файл
            Files.createFile(filePath);
        }
        if (!Files.exists(directoryPath)) {
            Files.createDirectory(directoryPath);
        }

        System.out.println("Files.isReadable(filePath) " + Files.isReadable(filePath));
        System.out.println("Files.isWritable(filePath) " + Files.isWritable(filePath));
        System.out.println("Files.isExecutable(filePath) " + Files.isExecutable(filePath));
        System.out.println("-------------------------------------");

        Path filePath2 = Paths.get("D:\\WORK\\Develop\\Java\\Projects\\VideoCourses\\test15.txt");
        System.out.println("Files.isSameFile(filePath, filePath2) " + Files.isSameFile(filePath, filePath2));
        System.out.println("-------------------------------------"); // - сравнивает ссылки на конкретный файл/папку

        System.out.println("Files.size(filePath) " + Files.size(filePath)); // - возвращает размер файла
        System.out.println("-------------------------------------");

        System.out.println("Files.getAttribute  (filePath, \"creationTime\") " +
                Files.getAttribute(filePath, "creationTime")); // - возвращает искомый атрибут
        System.out.println("-------------------------------------");

        Map<String, Object> attributes = Files.readAttributes(filePath, "*"); // - возвращает все атрибуты
        for (Map.Entry<String, Object> entry : attributes.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}