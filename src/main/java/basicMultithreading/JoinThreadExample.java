package basicMultithreading;

/* What is join() ?
 Imagine threads to be lines of execution. So, when we call •join() on a certain thread, it means the parent thread,
 the main thread in this case (could be any thread which created the thread on which . join() is being called) is saying
 "Hey thread, once you are done executing your task, join my flow of execution". It's like the parent thread waits for
 the completion of the child thread and then continues with its execution.  */

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
