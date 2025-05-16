package basicMultithreading;

/*
In Java, daemon threads are low-priority threads that run in the background to perform tasks such
 as garbage collection or provide services to user threads. The life of a daemon thread depends on
 the mercy of user threads, meaning that when all user threads finish their execution,
 the Java Virtual Machine (JVM) automatically terminates the daemon thread.
 */
public class DaemonUserThreadDemo {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(new DaemonHelperThread());
        Thread userThread =  new Thread(new UserThread());

        daemonThread.setDaemon(true);

        daemonThread.start();
        userThread.start();

    }
}

class DaemonHelperThread implements Runnable{
    @Override
    public void run() {
        int count = 0;
        while(count < 500){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("The Daemon Thread is running ...");
            count++;
        }
    }
}

class UserThread implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("The User Thread Completed the execution ...");
    }
}
