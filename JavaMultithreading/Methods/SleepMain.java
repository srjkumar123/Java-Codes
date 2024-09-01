package JavaMultithreading.Methods;

public class SleepMain {
    public static void main(String[] args) {
     Mythread th1 = new Mythread();
     th1.setName("ChildThread");
     th1.start();

        try {
            for (int i = 1; i <=10 ; i++) {
                System.out.println(i+". "+ Thread.currentThread().getName());

                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
}

class Mythread extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 1; i <=10 ; i++) {
                System.out.println(i+". "+ Thread.currentThread().getName());

                Thread.sleep(5000);
            }
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
}