package functional_interfaces;

public class Main {
    public static void main(String[] args) {
        MyFunctionalInterface myfi = ()-> System.out.println("Hellooooo from functional interface");
        myfi.show();
    }
}

@FunctionalInterface
interface MyFunctionalInterface{
    void show();

}