package basicMultithreading;

public class JoinThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Thread one = new Thread(()->{
            for(int i = 0; i< 10; i++){
                System.out.println("Thread One: "+ i);
            }
        });
        Thread two = new Thread(()->{
            for(int i = 0; i< 10; i++){
                System.out.println("Thread Two: "+ i);
            }
        });

        one.start();
        two.start();
        one.join();
        two.join();
        System.out.println("The execution of thread completed");
    }
}
