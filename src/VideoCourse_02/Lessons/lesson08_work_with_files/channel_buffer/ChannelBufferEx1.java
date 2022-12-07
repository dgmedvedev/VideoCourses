package VideoCourse_02.Lessons.lesson08_work_with_files.channel_buffer;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx1 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test10.txt", "rw");
             FileChannel channel = file.getChannel()) {
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}