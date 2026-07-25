import java.util.ArrayList;
import java.util.Scanner;

public class ATM {

    static double balance = 1000.0;
    static final int PIN = 1234;
    static ArrayList<String> transactions = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("         JAVA ATM");
        System.out.println("=================================");

        System.out.print("Enter 4-Digit PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin != PIN) {
            System.out.println("Invalid PIN!");
            sc.close();
            return;
        }

        System.out.println("\nLogin Successful!");

        while (true) {

            System.out.println("\n========== ATM MENU ==========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter Deposit Amount: ₹");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        transactions.add("Deposited ₹" + deposit);
                        System.out.println("Deposit Successful!");
                    } else {
                        System.out.println("Invalid Amount!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Withdraw Amount: ₹");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= 0) {
                        System.out.println("Invalid Amount!");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient Balance!");
                    } else {
                        balance -= withdraw;
                        transactions.add("Withdrawn ₹" + withdraw);
                        System.out.println("Withdrawal Successful!");
                    }
                    break;

                case 4:
                    System.out.println("\n----- Transaction History -----");

                    if (transactions.isEmpty()) {
                        System.out.println("No Transactions Yet.");
                    } else {
                        for (String t : transactions) {
                            System.out.println(t);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Thank You for Using Java ATM.");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}