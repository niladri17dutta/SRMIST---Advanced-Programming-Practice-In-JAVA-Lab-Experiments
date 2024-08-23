import java.util.Scanner;

public class DoWhileFactorial {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a non-negative integer
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        // Check if the entered number is non-negative
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            // Initialize the factorial variable to 1 (as 0! = 1)
            int factorial = 1;
            int i = 1;

            // Calculate the factorial using a do-while loop
            do {
                factorial *= i;
                i++;
            } while (i <= number);

            // Print the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
    }
}
