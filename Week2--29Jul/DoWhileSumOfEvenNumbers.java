import java.util.Scanner;

public class DoWhileSumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt(); // Read the number from the user

        int sum = 0; // Initialize the sum variable
        int i = 1; // Initialize the counter

        // Use a do-while loop to calculate the sum of even numbers
        do {
            if (i % 2 == 0) { // Check if the number is even
                sum += i; // Add the even number to the sum
            }
            i++; // Increment the counter
        } while (i <= n);

        System.out.println("The sum of even numbers from 1 to " + n + " is: " + sum);
    }
}
