import java.util.Scanner;

public class ATMSimulation {
    private static double balance = 1000.00; // initial account balance

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the ATM!");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdrawMoney(input);
                    break;
                case 3:
                    depositMoney(input);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void checkBalance() {
        System.out.println("Your account balance is: $" + balance);
    }

    private static void withdrawMoney(Scanner input) {
        System.out.print("Enter the amount to withdraw: $");
        double amount = input.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient funds. Please try again.");
        } else {
            balance -= amount;
            System.out.println("Please take your cash. Your remaining balance is: $" + balance);
        }
    }

    private static void depositMoney(Scanner input) {
        System.out.print("Enter the amount to deposit: $");
        double amount = input.nextDouble();

        balance += amount;
        System.out.println("Your deposit of $" + amount + " was successful. Your new balance is: $" + balance);
    }
}

