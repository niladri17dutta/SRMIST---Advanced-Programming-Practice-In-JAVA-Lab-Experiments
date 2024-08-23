import java.util.Scanner;

public class DoWhilePowersOfTwo {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the maximum exponent
        System.out.print("Enter the maximum exponent: ");
        int maxExponent = scanner.nextInt();

        // Initialize the exponent and power variables
        int exponent = 0;
        int power = 1; // 2^0 is 1

        // Print the powers of 2 using a do-while loop
        System.out.println("Powers of 2 up to 2^" + maxExponent + ":");
        do {
            System.out.println("2^" + exponent + " = " + power);
            exponent++;
            power *= 2; // Calculate the next power of 2
        } while (exponent <= maxExponent);
    }
}
