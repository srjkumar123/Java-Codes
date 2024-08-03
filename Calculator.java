public class Calculator {
    //METHOD OVERLOADING

    //method with 2 int variables args
    int add(int a, int b){
        return a + b;
    }

    //method with 3 int variables args
    int add (int a, int b, int c){
        return a + b + c;
    }

    //method with 2 double variables args
    double add(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        //Object Creation
        Calculator c1 = new Calculator();

        //Method call with two int variables
        System.out.println(c1.add(15,65));

        //Method call with three int variables
        System.out.println(c1.add(15,65, 90));

        //Method call with two double variables
        System.out.println(c1.add(65.9898, 90.9090954555));

    }
}
