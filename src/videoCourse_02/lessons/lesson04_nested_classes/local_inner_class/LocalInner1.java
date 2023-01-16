package videoCourse_02.lessons.lesson04_nested_classes.local_inner_class;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}

class Math {
    public void getResult() {
        class Division { // локальный класс виден только внутри метода
            private int divisible;
            private int divisor;

            public int getDivisible() {
                return divisible;
            }

            public void setDivisible(int divisible) {
                this.divisible = divisible;
            }

            public int getDivisor() {
                return divisor;
            }

            public void setDivisor(int divisor) {
                this.divisor = divisor;
            }

            public int getQuotient() {
                return divisible / divisor;
            }

            public int getRemainder() {
                return divisible % divisor;
            }
        }

        Division division = new Division();
        division.setDivisible(21);
        division.setDivisor(4);
        System.out.println("Делимое = " + division.getDivisible());
        System.out.println("Делитель = " + division.getDivisor());
        System.out.println("Частное = " + division.getQuotient());
        System.out.println("Остаток = " + division.getRemainder());
    }
}