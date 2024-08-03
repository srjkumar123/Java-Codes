import java.util.Scanner;

public class ArmstrongNumber {
    //method to find armstrong number
    void armstrongNum(int start, int end){
        for(int i=start; i<end; i++){
            //initialised sum to store sum
            int sum = 0;

            //store the first loop number in num
            int num = i;

            //loop to find the sum of cube of digits of number
            while(num != 0){
                int rem = num%10;
                int cube = rem*rem*rem;
                sum += cube;
                num = num/10;
            }

            //check if sum of cubes is equals to the current number
            if(sum == i){
                //print the number if sum is equal to the number
                System.out.println("Armstrong: "+ i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //First number user input
        System.out.print("Enter first number: ");
        int start = input.nextInt();

        //Second number user input
        System.out.print("Enter second number: ");
        int end = input.nextInt();

        //Create object of the class
        ArmstrongNumber newNum = new ArmstrongNumber();

        //Pass the user input as argument in the object method
        newNum.armstrongNum(start,end);
    }
}
