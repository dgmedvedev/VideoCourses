package VideoCourse_03.Homework.lesson23;

public class Cook extends Employee implements CookingAble{
    Cook(String name){
        super(name);
    }

    @Override
    public void cook() {
        System.out.println(name + " готовит");
    }
}