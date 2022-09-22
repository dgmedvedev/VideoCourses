package VideoCourse_01.Lessons.Lesson18;

public class Test1 {
    public static void main(String[] args) {
        int[] array1 = {2,3,4,5};
        String[] array2;
        double[] array3;
        double[] array4;
        double[][] array5;

        array3 = new double[3];
        array4 = new double[4];
        array5 = new double[5][3];

        array4[0] = 1.1;
        array4[1] = 2.2;
        array4[2] = 3.3;
        array4[3] = 4.4;

        array5[0] = array3;
        array5[1] = array4;

    }
}
