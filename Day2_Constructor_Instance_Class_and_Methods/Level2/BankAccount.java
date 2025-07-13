package Day2_Constructor_Instance_Class_and_Methods.Level2;

import java.util.*;

class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public void display() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder: " + accountHolder);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount sa = new SavingsAccount();
        sa.accountNumber = sc.nextLine();
        sa.accountHolder = sc.nextLine();
        sa.setBalance(sc.nextDouble());

        sa.display();
        System.out.println("Balance: ₹" + sa.getBalance());
    }
}
