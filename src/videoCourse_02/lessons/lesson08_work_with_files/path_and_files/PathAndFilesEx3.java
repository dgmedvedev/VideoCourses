package videoCourse_02.lessons.lesson08_work_with_files.path_and_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFilesEx3 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test10.txt");

        String text = "VideoCourse_02.Lessons.lesson08_work_with_files.channel_buffer.ChannelBufferEx1;" +
                "\nVideoCourse_02.Lessons.lesson08_work_with_files.path_and_files.PathAndFilesEx3;";

        Files.write(filePath, text.getBytes());

        List<String> list = Files.readAllLines(filePath);
        for (String str : list) {
            System.out.println(str);
        }
    }
}