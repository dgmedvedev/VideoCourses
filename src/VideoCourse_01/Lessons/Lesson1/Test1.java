package VideoCourse_01.Lessons.Lesson1;

public class Test1 {

    public static void main(String[] args) {

        byte b1 = 0b001100;
        byte b2 = 014;
        byte b3 = 12;
        byte b4 = 0xC;
        System.out.println("b1 = " + b1 + ", b2 = " + b2 + ", b3 = " + b3 + ", b4 = " + b4);

        short s1 = 0b0101_0001_0100;
        short s2 = 02424;
        short s3 = 1300;
        short s4 = 0x514;
        System.out.println("s1 = " + s1 + ", s2 = " + s2 + ", s3 = " + s3 + ", s4 = " + s4);

        int i1 = 0b0;
        int i2 = 00;
        int i3 = 0;
        int i4 = 0x0;
        System.out.println("i1 = " + i1 + ", i2 = " + i2 + ", i3 = " + i3 + ", i4 = " + i4);

        long l1 = 0b111010110111100110100010101L;
        long l2 = 0726746425L;
        long l3 = 123456789L;
        long l4 = 0x75BCD15L;
        System.out.println("l1 = " + l1 + ", l2 = " + l2 + ", l3 = " + l3 + ", l4 = " + l4);

        float f1 = 2.5f;
        float f2 = 0.0F;
        System.out.println("f1 = " + f1 + ", f2 = " + f2);


        double d1 = 0b0010;
        double d2 = 123.45;
        System.out.println("d1 = " + d1 + ", d2 = " + d2);

        boolean boo1 = true;
        boolean boo2 = false;
        System.out.println("boo1 = " + boo1 + ", boo2 = " + boo2);

        char c1 = 'A';
        char c2 = 33;
        char c3 = '\u0231';
        System.out.println("c1 = " + c1 + ", c2 = " + c2 + ", c3 = " + c3);

        int x = 10;
        int y =5;
        int z = x-- - y;
        System.out.println("z = " + z);
        System.out.println("x = " + x);


    }
}