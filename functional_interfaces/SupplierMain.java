package functional_interfaces;

import java.util.function.Supplier;

public class SupplierMain {

    public static void main(String[] args) {
        System.out.println((int)(Math.random()*5));

        Supplier<String> sp = () -> {
          String[] names = {"Suraj", "Deepak", "Rahul", "bharti", "Vijay"};
          int i = (int)(Math.random()* (names.length-1));
          return names[i];
        };

        System.out.println(sp.get());
    }
}
