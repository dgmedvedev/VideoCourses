package videoCourse_02.lessons.lesson03_collection.thread_safe;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Ivan");
        list.add("Petr");
        list.add("Oleg");
        list.add("Marina");
        list.add("Svetlana");
        System.out.println(list);

        Runnable runnable1 = () -> {
            for (String str : list) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(str);
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.remove(4);  // создалась копия CopyOnWriteArrayList
            list.add("Elena");     // создалась копия CopyOnWriteArrayList
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(list);
    }
}
