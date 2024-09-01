package JavaMultithreading;



public class PriorityTest {

    public static void main(String[] args) {
        ChildPriority th1 = new ChildPriority();

        th1.start();
        th1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Child thread priority "+th1.getPriority() );


        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);

        System.out.println("Hello "+ Thread.currentThread().getName());
        System.out.println("main thread "+Thread.currentThread().getPriority());
    }
}


class ChildPriority extends Thread{
    @Override
    public void run() {
        System.out.println("Hi...");
        System.out.println("Child Thread "+ Thread.currentThread().getName());
    }
}