package videoCourse_01.lessons.lesson26;

public class Test2 {
    void abc(byte b){System.out.println("byte");}
    void abc(short s){System.out.println("short");}
    //void abc(int i){System.out.println("int");}
    //void abc(long l){System.out.println("long");}
    void abc(float f){System.out.println("float");}
    void abc(double d){        System.out.println("double");}

    public static void main(String[] args) {
        Test2 test = new Test2();
        test.abc(10);
    }
}