class BankAccount {
    protected String accountNumber; // Account number of the bank account
    protected float balance; // Balance in the account

    // Constructor to initialize account details
    BankAccount(String accountNumber, float balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account type (to be overridden by subclasses)
    public void displayAccountType() {}
}

// Subclass representing a savings account
class SavingAccount extends BankAccount {
    private final float rateOfInterest; // Interest rate for the savings account

    // Constructor to initialize savings account details
    public SavingAccount(String accountNumber, float balance, float rateOfInterest) {
        super(accountNumber, balance); // Call the parent class constructor
        this.rateOfInterest = rateOfInterest;
    }

    // Display the type of account
    public void displayAccountType() {
        System.out.println("It is Saving account!");
    }

    // Display details of the savings account
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Rate of Interest: " + rateOfInterest);
        System.out.println();
    }
}

// Subclass representing a checking account
class CheckingAccount extends BankAccount {
    private final int withdrawalLimit; // Maximum number of withdrawals allowed

    // Constructor to initialize checking account details
    public CheckingAccount(String accountNumber, float balance, int withdrawalLimit) {
        super(accountNumber, balance); // Call the parent class constructor
        this.withdrawalLimit = withdrawalLimit;
    }

    // Display the type of account
    public void displayAccountType() {
        System.out.println("It is a Checking Account!");
    }

    // Display details of the checking account
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
        System.out.println();
    }
}

// Subclass representing a fixed deposit account
class FixedDepositeAccount extends BankAccount {
    private final int maturityPeriod; // Maturity period for the fixed deposit

    // Constructor to initialize fixed deposit account details
    public FixedDepositeAccount(String accountNumber, float balance, int maturityPeriod) {
        super(accountNumber, balance); // Call the parent class constructor
        this.maturityPeriod = maturityPeriod;
    }

    // Display the type of account
    public void displayAccountType() {
        System.out.println("It is an FD Account!");
    }

    // Display details of the fixed deposit account
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Maturity Period of FD: " + maturityPeriod);
        System.out.println();
    }
}

// Main class to test different types of bank accounts
public class BankAccountType {
    public static void main(String[] args) {
        // Create and display a savings account
        SavingAccount savingAccount = new SavingAccount("05070100010856", 24000f, 4.5f);
        savingAccount.displayAccountType();
        savingAccount.displayAccountDetails();

        // Create and display a checking account
        CheckingAccount checkingAccount = new CheckingAccount("05070100010857", 2000f, 5);
        checkingAccount.displayAccountType();
        checkingAccount.displayAccountDetails();

        // Create and display a fixed deposit account
        FixedDepositeAccount fixedDepositeAccount = new FixedDepositeAccount("05070100010858", 10000f, 5);
        fixedDepositeAccount.displayAccountType();
        fixedDepositeAccount.displayAccountDetails();
    }
}