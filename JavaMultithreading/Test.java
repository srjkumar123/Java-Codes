package JavaMultithreading;
class Thread1 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <=100 ; i++) {
            System.out.println("Child Thread");
        }
    }
}
public class Test {
    public static void main(String[] args) {
        Thread1 th = new Thread1();

        th.start();

        for (int i = 1; i <=100 ; i++) {
            System.out.println("Main Thread");
        }
    }
}
