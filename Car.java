public class Car {

    //class attributes defined
    String make;
    String model;
    short year;
    int price;

    //Constructor with parameters
    Car(String m, String md, short yr, int p){
        make = m;
        model = md;
        year = yr;
        price = p;
        System.out.println("Make:"+make);
        System.out.println("Model:"+model);
        System.out.println("Year:"+year);
        System.out.println("Price:"+price);

    }
    //main method
    public static void main(String[] args) {

        //Car object created
       Car newCar = new Car("Honda","XYZ",(short)2024,9999);


       //OUTPUT:
       /*   Make:Honda
            Model:XYZ
            Year:2024
            Price:9999 */

    }
}
