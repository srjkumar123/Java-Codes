import java.util.Scanner;

public class GrossSalary {

    //method to calculate Gross salary
    void grossSalary(int basicPay){
        //attributes defined in double
        double hra;
        double da;
        double grossSalary;
        //Logic to calculate gross salry acc. to basic pay
            if (basicPay > 15000){
                //hra 20% of basic pay
                hra = 0.2*basicPay;
                //dr 60% of basic pay
                da = 0.6*basicPay;
                //gross salary
                grossSalary = basicPay + hra + da ;
            }
            else{ //if basic pay less than 15k
                hra = 3000;
                //da 70% od basic pay
                da = 0.7*basicPay;
                //groass salary
                grossSalary = basicPay + hra + da ;
            }
            System.out.println("Your Gross salary: "+ grossSalary);
            System.out.println("===========================");




    }

    public static void main(String[] args) {
        //scanner class obj creation
        Scanner input = new Scanner(System.in);
        //Gross salry obj creation
        GrossSalary grossPay = new GrossSalary();

        //choice variable intitialised to store user choice
        int choice;

        //using do while loop to show Gross salary of one user and after that
        // asking user if he wnts to continue
        do {
            //taking basic pay input from the user
            System.out.println("Basic Pay: ");
            int salary = input.nextInt();

            //passing the salary input as argument
            // in the grossSalary method of object grossPay
            grossPay.grossSalary((salary));

            //taking user choice to continue
            System.out.println("To continue type -1 ");
            choice = input.nextInt();//storing the user input
        }
        while (choice==-1); //checking the user choice




    }

}
