package Ags2;

class Student{
    //instance variables
    String name;
    int age;
    String department;

    //default constructor
    Student(){
        name = "Unknown";
        age = 20;
        department = "Unassigned";
    }

    //Two parameter Constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
        department = "IT";
    }

    //Three parameter Constructor
    Student(String name, int age, String department){
        this.name = name;
        this.age = age;
        this.department = department;
    }
}


public class Main {
    public static void main(String[] args) {
        //Calling Default Constructor
        System.out.println("Default Constructor: ");
        Student s1 = new Student();
        System.out.println(s1.name +"\n"+ s1.age +"\n"+ s1.department);
        System.out.println("========================================");

        //Calling Both pameterized constructor
        System.out.println("Two parameterized constructor: ");
        Student s2 = new Student("Suraj", 21);
        System.out.println(s2.name +"\n"+ s2.age +"\n"+ s2.department);
        System.out.println("========================================");


        System.out.println("Three parameterized constructor: ");
        Student s3 = new Student("Suraj", 21, "Software Development");
        System.out.println(s3.name +"\n"+ s3.age +"\n"+ s3.department);
    }
}
