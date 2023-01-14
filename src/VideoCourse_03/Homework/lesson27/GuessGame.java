package VideoCourse_03.Homework.lesson27;

public class GuessGame {
    static int guesserId = 1;
    static boolean win = false;

    public static void main(String[] args) {
        int random = (int) (Math.random() * 1_000_000);
        System.out.printf("Загаданное число = %s", random);

        Timer timer = new Timer();
        timer.start();

        for (int i = 0; i < 3; i++) {
            new Guesser(random).start();
        }
    }

    static class Timer extends Thread {
        @Override
        public void run() {
            int i = 1;
            try {
                while (!win) {
                    Thread.sleep(1000);
                    System.out.println(i);
                    i++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Guesser extends Thread {
        int hiddenNumber;

        Guesser(int hiddenNumber) {
            super("Guesser №" + guesserId);
            this.hiddenNumber = hiddenNumber;
            guesserId++;
        }

        @Override
        public void run() {
            while (!win) {
                int random = (int) (Math.random() * 1_000_000);
                System.out.printf(Thread.currentThread().getName() +
                        " считает, что hidden number = %s", random);
                System.out.println();
                if (random == hiddenNumber) {
                    System.out.println(Thread.currentThread().getName() + " win!!!");
                    System.out.printf("!!!!!THE HIDDEN NUMBER = %s", hiddenNumber);
                    System.out.println();
                    win = true;
                }
            }
            System.out.println(Thread.currentThread().getName() + " завершил работу");
        }
    }
}