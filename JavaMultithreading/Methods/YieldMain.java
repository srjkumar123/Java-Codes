package JavaMultithreading.Methods;

public class YieldMain {
    public static void main(String[] args) {
      YieldThread th1 = new YieldThread();
      th1.start();




        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ". " + Thread.currentThread().getName());
        }
    }
}


class YieldThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ". " + Thread.currentThread().getName());
            Thread.yield();
        }
    }
}