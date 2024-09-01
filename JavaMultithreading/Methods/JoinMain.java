package JavaMultithreading.Methods;

public class JoinMain {
    public static void main(String[] args) {
        Thread tmain = Thread.currentThread();
        ChildJoin th1 = new ChildJoin(tmain);
        th1.start();


        try {

//            ChildJoin2 th2 = new ChildJoin2();
//            th2.start();
//            th2.join();

            for (int i = 1; i <=5 ; i++) {
                System.out.println("Hello main... "+ i);
                Thread.sleep(1000);
            }

        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}


class ChildJoin extends Thread{
    Thread th;
    public ChildJoin(Thread th){
        this.th = th;
    }
    @Override
    public void run() {
        try {
            th.join();
            for (int i = 1; i <=5 ; i++) {
                System.out.println("Hi th1 "+ i);
                sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}


class ChildJoin2 extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 1; i <=5 ; i++) {
                System.out.println("th2 "+ i);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}