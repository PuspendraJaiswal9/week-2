public class BankAccount {
    // Public member
    public int accountNumber;

    // Protected member
    protected String accountHolder;

    // Private member
    private double balance;

    // Constructor to initialize account details
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount(12345, "Puspendra Jaiswal", 1000.0);

        account.displayAccountDetails();

        // Perform deposit and withdrawal operations
        account.deposit(500.0);
		account.displayAccountDetails();
        account.withdraw(300.0);
        account.displayAccountDetails();
    }
}