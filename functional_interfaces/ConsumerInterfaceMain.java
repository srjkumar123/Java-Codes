package functional_interfaces;

import java.util.function.Consumer;

public class ConsumerInterfaceMain {

    public static void main(String[] args) {

        Consumer<String> c1 = str -> System.out.println("Hi "+str.concat("@gmail.com"));
        c1.accept("srjkumar");
        c1.accept("narender");
    }
}
