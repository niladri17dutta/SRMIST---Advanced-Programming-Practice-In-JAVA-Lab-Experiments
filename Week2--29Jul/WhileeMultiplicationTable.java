import java.util.Scanner;

public class WhileeMultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize the counter variable
        int i = 1;

        // Print the multiplication table using a while loop
        System.out.println("Multiplication table of " + number + ":");
        while (i <= 10) {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }

        // Close the scanner
        scanner.close();
    }
}
