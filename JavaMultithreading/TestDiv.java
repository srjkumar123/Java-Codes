package JavaMultithreading;

class Divide {

    void divide(){
        int a = 100;
        int b = 0;
        int c = a/b;
    }

}
public class TestDiv{
    public static void main(String[] args) {

        Thread.currentThread().setName("Chheen Tapaak Dam Dam");
        Divide d= new Divide();
        d.divide();
    }
}