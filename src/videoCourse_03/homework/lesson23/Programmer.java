package videoCourse_03.homework.lesson23;

public class Programmer extends Employee implements CodeWritable {
    Programmer(String name) {
        super(name);
    }

    @Override
    public void writingCode() {
        System.out.println(getName() + " пишет код");
    }
}