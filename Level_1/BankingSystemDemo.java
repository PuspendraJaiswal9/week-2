abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public abstract double calculateInterest();
}

// Subclasses: SavingsAccount, CurrentAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return 0; // No interest for current accounts
    }
}

// Interface: Loanable
interface Loanable {
    boolean applyForLoan(double amount);

    double calculateLoanEligibility();
}

// Main Method to Demonstrate Polymorphism
public class BankingSystemDemo {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("S123", "ayan", 1000, 5);
        BankAccount acc2 = new CurrentAccount("C456", "vivek", 2000, 500);

        BankAccount[] accounts = {acc1, acc2};

        for (BankAccount account : accounts) {
            System.out.println("Account Holder: " + account.getHolderName() + ", Interest: " + account.calculateInterest());
        }
    }
}