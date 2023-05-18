/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingsystem;

/**
 *
 * @author student
 */
public class Account {

    private String firstName;
    private String lastName;
    private int accountNumber;
    private double balance;
    private final double rate;

    public Account() {
        this.balance = 500.0; // Initial balance of 500
        this.rate = 0.05; // Monthly interest rate of 5%
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        System.out.println("Current balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("Current balance: $" + balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void calMonthlyInterest() {
        double interest = balance * rate;
        System.out.println("Monthly interest: $" + interest);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
