class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{accountNumber='" + accountNumber + "', balance=" + balance + "}";
    }
}

public class Q5aMutableFunctionExample {

    // Mutable function to update the balance of a bank account
    public static void updateBalance(BankAccount account, double newBalance) {
        account.setBalance(newBalance);  // Modifies the balance of the bank account
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 5000.0);
        System.out.println("Before Update: " + account);

        updateBalance(account, 6000.0);  // Updating the balance
        System.out.println("After Update: " + account);
    }
}
