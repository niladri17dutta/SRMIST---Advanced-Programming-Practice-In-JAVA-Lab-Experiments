import java.util.Scanner;

public class WhileAverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt(); // Read the number of elements from the user

        int sum = 0; // Initialize the sum variable
        int count = 0; // Initialize the counter

        while (count < n) {
            System.out.print("Enter number " + (count + 1) + ": ");
            int number = scanner.nextInt(); // Read the next number
            sum += number; // Add the number to the sum
            count++; // Increment the counter
        }

        double average = (double) sum / n; // Calculate the average
        System.out.println("The average is: " + average);
    }
}
