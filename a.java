
import java.util.Scanner;

public class a {
    private static double balance = 1000.00;

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
        int choice;

        do {
            System.out.println("Welcome to the ATM");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            choice = scanner.nextInt();
        

            switch(choice) {
                case 1:
                    System.out.println("Current Balance: $" + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = scanner.nextDouble();
                    balance += deposit;
                    System.out.println("Deposited: $" + deposit);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = scanner.nextDouble();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawn: $" + withdraw);
                    } else {
                        System.out.println("Insufficient funds!");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (choice != 4);

    }
    }
}

