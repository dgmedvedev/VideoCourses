package videoCourse_02.lessons.lesson08_work_with_files.channel_buffer;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx2 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test5.txt", "r");
             FileChannel channel = file.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(5);
            channel.read(buffer);
            buffer.flip(); // - меняет режим записи на режим чтения, устанавливая позицию на нулевую.
            // При этом limit (кол-во байтов, доступных для чтения из буфера) = кол-ву записанных ячеек в режиме записи
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            buffer.rewind(); // - возвращает позицию на нулевую
            System.out.println((char) buffer.get());
            System.out.println("----------------------");
            buffer.compact(); // - сохраняет непрочитанные байты, но перезаписывает свободные байты
            channel.read(buffer);
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.println((char) buffer.get());
            }
            System.out.println("----------------------");
            buffer.clear(); // - не очищает буфер, а перемещает позицию на нулевую для перезаписи новых байтов
            channel.read(buffer);
            buffer.flip();
            System.out.println((char) buffer.get());
            buffer.mark(); // - ставит отметку на конкретной позиции
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            buffer.reset(); // - возвращается к отмеченной позиции
            while (buffer.hasRemaining()) {
                System.out.println((char) buffer.get());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}