package JavaMultithreading;

public class SoundVideoPlayer {
    public static void main(String[] args) {

//        Runnable audio = new Runnable() {
//            public void run() {
//                for (int i = 1; i <=100 ; i++) {
//                    System.out.println("Playing Sound..");
//                }
//            }
//        };
//        Thread th1 = new Thread(audio);
//        th1.start();
//
//        Runnable video = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1; i <=100 ; i++) {
//                    System.out.println("Playing Video..");
//                }
//            }
//        };
//
//        Thread th2 = new Thread(video);
//        th2.start();
//
//
//        for (int i = 1; i <=100 ; i++) {
//            System.out.println("main thread");
//        }

        NoRun th3 = new NoRun();
        th3.start();

    }
}

class NoRun extends Thread{

}
