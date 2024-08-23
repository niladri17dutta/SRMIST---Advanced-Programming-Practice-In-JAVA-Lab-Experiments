import java.util.Scanner;

public class ForEvenNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Print all even numbers from 1 to the given number using a for loop
        System.out.println("Even numbers from 1 to " + number + ":");
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
