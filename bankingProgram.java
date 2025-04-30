import java.util.Scanner;

public class bankingProgram{

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //JAVA BANKING PROGRAM

        //Declare veriables

        double balance=0;
        boolean isRunning = true;
        int choice;
        
        // Display Menu
        while(isRunning){
            System.out.println("%%%%%%%%%%%%%%%%%");
            System.out.println("BANKING PROGRAM");
            System.out.println("%%%%%%%%%%%%%%%%%");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("%%%%%%%%%%%%%%%%%");
    
            // Get and process user balance
    
            System.out.print("Enter your choice(1-4) : ");
            choice=scanner.nextInt();
    
            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance+=deposit();
                case 3 -> balance-=Withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
    
    
            }

        }
            //EXIT
            System.out.println("#############################");
            System.out.println("Thank you. Have a Nice day.");
            System.out.println("#############################");
       


        

        

       

        

        scanner.close();
    } 
    // Show balance()
    static void showBalance(double balance){
        System.out.printf("$%.2f\n", balance);
    }
    // Deposit()

    static double deposit(){
        double amount;
        System.out.print("Enter an amount to deposit : ");
        amount= scanner.nextDouble();

        if(amount < 0){
            System.out.println("Enter valid number.");
            return 0;
        }
        else{
            return amount;
        } 
    }
     // Withdraw()
    static double Withdraw(double balance){
        double amount;
        System.out.print("Enter amount to be withdrawn: ");
        amount=scanner.nextDouble();

        if(amount> balance){
            System.out.println("Insufficient balance.");
            return 0;
        }
        else if(amount <0){
            System.out.println("Amount can't be negative");
            return 0;

        }
        else{
            return amount;
        }

        

    }
}