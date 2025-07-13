package Day6_Class_and_Objects.Level2;

import java.util.*;

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
        	balance -= amount;
        }
        else {
        	System.out.println("Insufficient Balance");
        }
    }

    public void displayBalance() {
    	 System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account holder name");
        String holder = sc.nextLine();
        System.out.println("Enter the account number");
        String accNumber = sc.nextLine();
        System.out.println("Enter the account balance");
        double balance = sc.nextDouble();
        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        BankAccount account = new BankAccount(holder, accNumber, balance);
        account.deposit(depositAmount);
        account.withdraw(withdrawAmount);
        account.displayBalance();
    }
}
