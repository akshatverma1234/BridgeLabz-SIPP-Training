package Introduction_To_Inheritence;

class BankAccount {
    String accountNumber;
    double balance;
}

class SavingsAccount extends BankAccount {
    double interestRate;
    void displayAccountType() {
        System.out.println("Savings Account");
    }
}

class CheckingAccount extends BankAccount {
    int withdrawalLimit;
    void displayAccountType() {
        System.out.println("Checking Account");
    }
}

class FixedDepositAccount extends BankAccount {
    int durationMonths;
    void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}

public class BankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.accountNumber = "AKSHJ12";
        s.balance = 1500;
        s.interestRate = 3.2;
        s.displayAccountType();

        CheckingAccount c = new CheckingAccount();
        c.accountNumber = "THSK345";
        c.displayAccountType();
    }
}
