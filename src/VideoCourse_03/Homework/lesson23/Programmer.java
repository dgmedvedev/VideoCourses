package VideoCourse_03.Homework.lesson23;

public class Programmer extends Employee implements ProgrammingAble{
    Programmer(String name) {
        super(name);
    }

    @Override
    public void writingCode(){
        System.out.println(name + " пишет код");
    }
}