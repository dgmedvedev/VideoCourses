package VideoCourse_02.Lessons.lesson08_work_with_files.channel_buffer;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx1 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test10.txt", "rw");
             FileChannel channel = file.getChannel()) {
// Чтение из файла
            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder poem = new StringBuilder();

            int byteRead = channel.read(buffer);

            while (byteRead > 0) {
                System.out.println("Read " + byteRead + " bytes");

                buffer.flip();

                while (buffer.hasRemaining()) {
                    poem.append((char) buffer.get());
                }

                buffer.clear();
                byteRead = channel.read(buffer);
            }
            System.out.println(poem);

// Запись в файл
            String text = """
                                        
                    There are only two ways to live your life.
                    One is as though nothing is a miracle.
                    The other is as though everything is as though everything is a miracle.""";

            // 1-ый способ записи в файл
            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);
            buffer2.put(text.getBytes());
            buffer2.flip();
            channel.write(buffer2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}