package JavaMultithreading.CollegeAdmission;

public class CollegeAdmin {

    public static void main(String[] args) {

        try {
            TakeAdmission admission = new TakeAdmission();
            admission.start();
            admission.join();

            DepositFee fee = new DepositFee();
            fee.start();
            fee.join();

            TakeRoll roll = new TakeRoll();
            roll.start();
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}


class TakeAdmission extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Admission starts");
            Thread.sleep(5000);
            System.out.println("Admission sucessful");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}


class DepositFee extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Depositing Fee");
            Thread.sleep(3000);
            System.out.println("Fee Deposit Sucessful");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

class TakeRoll extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Take roll no");
            Thread.sleep(3000);
            System.out.println("You can give exam now");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}