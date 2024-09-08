package functional_interfaces;

import java.util.function.Function;

public class FunctionMain {

    public static void main(String[] args) {
        Function<Integer, Integer> f = sal -> sal*12;
        System.out.println(f.apply(45000));

        Function<String, String> f2 = str -> str.concat(" is a Java Developer");
        System.out.println(f2.apply("Suraj"));
        System.out.println(f2.apply("Narender"));
    }
}



