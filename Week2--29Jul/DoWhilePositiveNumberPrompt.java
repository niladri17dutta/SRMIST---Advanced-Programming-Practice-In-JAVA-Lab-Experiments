import java.util.Scanner;

public class DoWhilePositiveNumberPrompt {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        int number;

        // Continuously prompt the user to enter a positive number using a do-while loop
        do {
            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("The number you entered is not positive. Please try again.");
            }
        } while (number <= 0);

        // Print the valid positive number
        System.out.println("You entered a valid positive number: " + number);

        // Close the scanner
        scanner.close();
    }
}
