package videoCourse_02.lessons.lesson04_nested_classes.local_inner_class;

public class LocalInner2 {
    public static void main(String[] args) {
        Math2 math = new Math2();
        math.getResult(21, 4);
    }
}

class Math2 {
    public void getResult(int divisible, final int divisor) {
        class Division {

            public int getQuotient() {
                return divisible / divisor;
            }

            public int getRemainder() {
                return divisible % divisor;
            }
        }

        Division division = new Division();
        System.out.println("Делимое = " + divisible);
        System.out.println("Делитель = " + divisor);
        System.out.println("Частное = " + division.getQuotient());
        System.out.println("Остаток = " + division.getRemainder());
    }
}