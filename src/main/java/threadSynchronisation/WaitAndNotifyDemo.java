package threadSynchronisation;

import java.sql.SQLOutput;

public class WaitAndNotifyDemo {

    private static final Object LOCK = new Object();

    public static void main(String[] args) {
        Thread one = new Thread(()->{
            try {
                one();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread two = new Thread(()->{
            try {
                two();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        one.start();
        two.start();
    }

    private static void one() throws InterruptedException {
        synchronized (LOCK){
            System.out.println("From the method One");
            LOCK.wait();
            System.out.println("Back again from method one");
        }
    }
    private static void two() throws InterruptedException {
        synchronized (LOCK){
            System.out.println("From the method two");
            LOCK.notify();
            System.out.println("Continue from the method two");
        }

    }
}
