package basicMultithreading;

import java.sql.SQLOutput;

public class ThreadPriorityExample {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " says hi!");

        Thread one = new Thread(()->{
           for(int i = 0 ; i < 10; i++) {
               System.out.println("Thread one low priority running .." + i);
           }
        });

        Thread two = new Thread(()->{
            for(int i = 0 ; i < 10; i++){
                System.out.println("Thread two high priority running .." + i);
            }
        });

        one.setPriority(Thread.NORM_PRIORITY);
        two.setPriority(Thread.MAX_PRIORITY);
        one.start();
        two.start();

    }
}
