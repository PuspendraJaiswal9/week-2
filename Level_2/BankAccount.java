import java.util.ArrayList;
import java.util.List;

class Bank {
    private String name;
    private List<Customer> customers; // List of associated customers

    // Constructor
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // Method to open an account for a customer
    public void openAccount(Customer customer, double initialBalance) {
        Account account = new Account(this, initialBalance);
        customer.addAccount(account);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account opened for " + customer.getName() + " with balance: " + initialBalance);
    }

    // Getter for bank name
    public String getName() {
        return name;
    }
}

// Customer Class
class Customer {
    private String name;
    private List<Account> accounts; // List of accounts associated with the customer

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Method to add an account
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Method to view balance of all accounts
    public void viewBalance() {
        System.out.println("Customer: " + name + "'s Account Balances:");
        for (Account account : accounts) {
            System.out.println("Bank: " + account.getBank().getName() + ", Balance: " + account.getBalance());
        }
    }

    // Getter for customer name
    public String getName() {
        return name;
    }
}

// Account Class
class Account {
    private Bank bank; // Associated bank
    private double balance;

    // Constructor
    public Account(Bank bank, double balance) {
        this.bank = bank;
        this.balance = balance;
    }

    // Getter for bank
    public Bank getBank() {
        return bank;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }
}

public class BankAccount {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank("MyBank");

        // Create customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Open accounts for customers
        bank.openAccount(customer1, 1000.0);
        bank.openAccount(customer1, 1500.0);
        bank.openAccount(customer2, 2000.0);

        // View balances
        customer1.viewBalance();
        customer2.viewBalance();
    }
}