package Ags1;


//Vehicle Class
class Vehicle {
    //method to print
    void start(){
        System.out.println("Vehicle started");
    }
}
//Car class extends the VEhicle
class Car extends Vehicle {

    //start method overridden to "Car started."
    @Override
    void start() {
        System.out.println("Car started.");
    }
}
class Motorcycle extends Vehicle {

    //methodn overridden to print Motorcycle started

    @Override
    void start() {
        System.out.println("Motorcycle started.");
    }
}

//Garage class
class Garage {
    //method taking Vehicle obj as arg
    void serviceVehicle(Vehicle vehicle){

        vehicle.start();
        System.out.println("Vehicle serviced.");
    }
}

public class Main {

    public static void main(String[] args) {
        //Car object created with parent reference
        Vehicle car = new Car();
        //Car object created with parent reference
        Vehicle bike = new Motorcycle();
        //Garage obj created
        Garage g1 = new Garage();

        //passing car and bike obj in garage
        g1.serviceVehicle(car);
        g1.serviceVehicle(bike);
    }
}

