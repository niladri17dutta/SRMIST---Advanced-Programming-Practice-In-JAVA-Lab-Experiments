import java.util.Scanner;

public class ForSimpleInterest {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the principal amount
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // Prompt the user to enter the annual interest rate (in percentage)
        System.out.print("Enter the annual interest rate (in percentage): ");
        double rate = scanner.nextDouble();

        // Prompt the user to enter the number of years
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        // Calculate the simple interest for each year using a for loop
        System.out.println("Year\tSimple Interest");
        for (int i = 1; i <= years; i++) {
            double simpleInterest = (principal * rate * i) / 100;
            System.out.println(i + "\t" + simpleInterest);
        }

        // Close the scanner
        scanner.close();
    }
}
