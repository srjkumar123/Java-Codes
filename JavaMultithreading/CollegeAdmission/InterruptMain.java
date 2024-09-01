package JavaMultithreading.CollegeAdmission;

public class InterruptMain {
    public static void main(String[] args) {
        MyThread3 th = new MyThread3();
        th.start();
        th.interrupt();
    }
    
}


class MyThread3 extends Thread{
    @Override
    public void run() {
        System.out.println("Is thread Interrupted(1): "+ Thread.interrupted());
        try {
            for (int i = 1; i <=5 ; i++) {
                System.out.println("Hi.. "+ i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Is thread Interrupted(2): "+ Thread.currentThread().isInterrupted());
        try {
            for (int i = 1; i <=5 ; i++) {
                System.out.println("Hello after interrrupt.. "+ i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}