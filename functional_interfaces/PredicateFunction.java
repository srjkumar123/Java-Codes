package functional_interfaces;

import java.util.function.Predicate;

public class PredicateFunction {
    public static void main(String[] args) {
//        A obj1 = new A();
//        System.out.println(obj1.test(56));

        //using lambda function
//        I1 obj = n -> n%2==0;
//        System.out.println(obj.test(25));



        //Java has already Provided that interface to check/test the condition
        Predicate<Integer> ob = no -> no%2==0;
        System.out.println(ob.test(67));


        //Find string length is greater
        Predicate<String> p = str -> str.length() > 6;
        System.out.println(p.test("Surajdfdf"));
    }
}


@FunctionalInterface
interface I1{
    boolean test(int no);
}

class A implements I1{
    @Override
    public boolean test(int no) {
        return no%2==0;
    }
}