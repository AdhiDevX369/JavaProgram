package bankingsystem;

import java.util.Scanner;

public class BankingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        // Set account details
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        account.setFirstName(firstName);

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        account.setLastName(lastName);

        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();
        account.setAccountNumber(accountNumber);

        boolean exit = false;

        while (!exit) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Calculate Monthly Interest");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.calMonthlyInterest();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        // Print account details
        System.out.println("\nAccount Holder: " + account.getFullName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Current Balance: $" + account.getBalance());

        scanner.close();
    }
}adithy
