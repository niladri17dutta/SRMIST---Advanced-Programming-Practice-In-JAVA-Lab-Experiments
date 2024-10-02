public class Q5bImmutableFunctionExample {

    // Immutable function to calculate interest earned on a bank account
    public static double calculateInterest(BankAccount account, double interestRate) {
        return account.getBalance() * (interestRate / 100);  // Does not modify the balance
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 6000.0);

        double interest = calculateInterest(account, 5.0);  // Assuming 5% interest rate
        System.out.println("Interest Earned: " + interest);
    }
}
