package JavaMultithreading;

public class RunnableTest {
    public static void main(String[] args) {
        ThreadRunnable runnbale = new ThreadRunnable();
        Thread th1 = new Thread(runnbale, "RunnableThread");
        //th1.setName("DEMON KANE");
        th1.start();
        th1.setDaemon(true);


        for (int i = 0; i <=100 ; i++) {
            System.out.println("Main thread --> "+ i +" --> "+Thread.currentThread().getName());
        }
    }
}


class ThreadRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <=100 ; i++) {
            System.out.println("Child thread --> "+ i +" --> "+Thread.currentThread().getName());
        }
    }
}