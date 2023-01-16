package videoCourse_01.lessons.lesson27;

import java.io.*;

public class Test18 {
    public static void main(String[] args) {

    }
}

class Superclass {
    Superclass() throws FileNotFoundException {
    }
}
// в конструкторах subclass-ов можно выбрасывать исключения более высокого уровня, чем в конструкторах superclass-ов
// в Override методах нельзя (пример Test19)
class Subclass extends Superclass {
    Subclass() throws IOException {
        super();
    }
}