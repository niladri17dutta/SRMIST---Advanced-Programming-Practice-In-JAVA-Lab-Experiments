import java.util.Scanner;

public class WhilePrintNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt(); // Read the number from the user

        int i = 1; // Initialize the counter

        while (i <= n) {
            System.out.print(i + " "); // Print the current number
            i++; // Increment the counter
        }
    }
}
