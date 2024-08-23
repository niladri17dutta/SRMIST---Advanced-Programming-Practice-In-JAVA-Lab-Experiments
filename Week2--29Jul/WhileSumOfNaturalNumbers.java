import java.util.Scanner;

public class WhileSumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt(); // Read the number from the user

        int sum = 0; // Initialize the sum variable
        int i = 1; // Initialize the counter

        while (i <= n) {
            sum += i; // Add the current number to the sum
            i++; // Increment the counter
        }

        System.out.println("The sum of natural numbers from 1 to " + n + " is: " + sum);
        
        scanner.close(); // Close the scanner
    }
}
