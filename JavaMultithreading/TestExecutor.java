package JavaMultithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutor {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(10);

        for (int i = 1; i <=100 ; i++) {
            NumToPrint np = new NumToPrint(i);
            es.submit(np);
        }
        es.shutdown();
    }
}

class NumToPrint implements Runnable{

    int num;

    public NumToPrint(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println(num+ " "+ Thread.currentThread().getName());
    }
}
