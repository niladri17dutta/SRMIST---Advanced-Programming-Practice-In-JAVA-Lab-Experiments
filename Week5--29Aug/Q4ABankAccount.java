public class Q4ABankAccount {
    // Private attributes
    private String accountNumber;
    private double balance;
    private static final double MINIMUM_BALANCE = 0.0;

    // Constructor to initialize account number and initial balance
    public Q4ABankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= MINIMUM_BALANCE) {
            this.balance = initialBalance;
        } else {
            this.balance = MINIMUM_BALANCE;
            System.out.println("Initial balance cannot be negative. Setting balance to " + MINIMUM_BALANCE);
        }
    }

    // Public getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Public setter for accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Public method to deposit funds
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Public method to withdraw funds
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance - amount >= MINIMUM_BALANCE) {
                balance -= amount;
                System.out.println("Withdrew: " + amount + ". New balance: " + balance);
            } else {
                System.out.println("Insufficient balance. Withdrawal denied.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Public method to check the current balance
    public double getBalance() {
        return balance;
    }
}
