import java.util.Scanner;

public class Atm {
    private static double balance = 5000; // initial balance
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to the ATM");
        System.out.println("Please enter your PIN:");
        
        int pin = input.nextInt();
        
        if (pin == 1234) {
            displayMenu(input);
        } else {
            System.out.println("Invalid PIN");
        }
    }
    
    private static void displayMenu(Scanner input) {
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            
            int option = input.nextInt();
            
            switch (option) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdraw(input);
                    break;
                case 3:
                    deposit(input);
                    break;
                case 4:
                    transfer(input, option, null);
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM");
                    return;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
    
    private static void checkBalance() {
        System.out.println("Your balance is: " + balance);
    }
    
    private static void withdraw(Scanner input) {
        System.out.println("Enter amount to withdraw:");
        
        double amount = input.nextDouble();
        
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
            System.out.println("Remaining balance: " + balance);
        }
    }
    
    private static void deposit(Scanner input) {
        System.out.println("Enter amount to deposit:");
        
        double amount = input.nextDouble();
        
        balance += amount;
        System.out.println("New balance: " + balance);
    }
    private static void transfer(Scanner input, int amt , String name){
        System.out.println("Enter receiver name: ");
        name=input.next();
        System.out.println("Enter amount to transfer: ");
        amt=input.nextInt();
        balance -=amt;
        System.out.println("\nRemaining balance is : "+balance);
        System.out.println("Transfer successful!! Thankyou!!");
    }
}
//Rutuja Boke
 