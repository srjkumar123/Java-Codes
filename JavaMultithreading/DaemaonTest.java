package JavaMultithreading;

public class DaemaonTest {

    public static void main(String[] args) {
        ChildThread th1 = new ChildThread();
        th1.setDaemon(true);
        th1.start();

        System.out.println("main thread "+Thread.currentThread().isDaemon());
    }
}


class ChildThread extends Thread{
    @Override
    public void run() {
        System.out.println("Hi...");
        System.out.println("Child Thread "+ Thread.currentThread().isDaemon());
    }
}