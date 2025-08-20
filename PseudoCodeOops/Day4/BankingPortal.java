class Account {
    String accountNumber;
    double balance;

    Account(String accNo, double balance) {
        this.accountNumber = accNo;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount) balance -= amount;
        else print("Insufficient balance");
    }
}

class SavingAccount extends Account {
    double withdrawalLimit = 10000;

    SavingAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    void withdraw(double amount) {
        if (amount <= withdrawalLimit && balance >= amount) {
            balance -= amount;
            print("Withdrawal successful from Saving");
        } else {
            print("Cannot withdraw");
        }
    }
}

class CurrentAccount extends Account {
    double overdraftLimit = 5000;

    CurrentAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            print("Withdrawal successful from Current");
        } else {
            print("Cannot withdraw");
        }
    }
}
